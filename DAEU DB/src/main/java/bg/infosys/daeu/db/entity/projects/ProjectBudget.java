package bg.infosys.daeu.db.entity.projects;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Audited
@Entity
@Table(schema = "projects", name = "project_budgets")
public class ProjectBudget implements Comparable<ProjectBudget>{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_version_id")
	private ProjectVersion projectVersion;
	public static final String _projectVersion = "projectVersion";
	
	@Column(name = _value)
	private BigDecimal value;
	public static final String _value = "value";
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "budget_type_id")
	private ProjectBudgetType projectBudgetType;
	public static final String _projectBudgetType = "projectBudgetType";
	
	public ProjectBudget() {}
	
	public ProjectBudget(ProjectVersion projectVersion, ProjectBudgetType projectBudgetType) {
		this.projectVersion = projectVersion;
		this.projectBudgetType = projectBudgetType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectVersion getProjectVersion() {
		return projectVersion;
	}

	public void setProjectVersion(ProjectVersion projectVersion) {
		this.projectVersion = projectVersion;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public ProjectBudgetType getProjectBudgetType() {
		return projectBudgetType;
	}

	public void setProjectBudgetType(ProjectBudgetType projectBudgetType) {
		this.projectBudgetType = projectBudgetType;
	}
	
	public ProjectBudget copyFrom(ProjectVersion version, ProjectBudget that) {
		if (that != null) {
			this.projectVersion = version;
			this.value = that.value;
			this.projectBudgetType = that.projectBudgetType;
		}
		return this;
	}

	@Override
	public int compareTo(ProjectBudget o) {
		return this.getProjectBudgetType().getId().compareTo(o.getProjectBudgetType().getId());
	}
}
