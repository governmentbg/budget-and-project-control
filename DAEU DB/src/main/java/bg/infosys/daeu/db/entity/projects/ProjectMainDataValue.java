package bg.infosys.daeu.db.entity.projects;

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
@Table(schema = "projects", name = "project_main_data_values")
public class ProjectMainDataValue implements Comparable<ProjectMainDataValue> {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_main_data_id")
	private ProjectMainData projectMainData;
	public static final String _projectMainData = "projectMainData";

	@Column(name = _value)
	private String value;
	public static final String _value = "value";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_form_config_id")
	private ProjectFormConfig projectFormConfig;
	public static final String _projectFormConfig = "projectFormConfig";

	public ProjectMainDataValue() {}

	public ProjectMainDataValue(ProjectMainData projectMainData, ProjectFormConfig projectFormConfig) {
		this.projectMainData = projectMainData;
		this.projectFormConfig = projectFormConfig;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectMainData getProjectMainData() {
		return projectMainData;
	}

	public void setProjectMainData(ProjectMainData projectMainData) {
		this.projectMainData = projectMainData;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ProjectFormConfig getProjectFormConfig() {
		return projectFormConfig;
	}

	public void setProjectFormConfig(ProjectFormConfig projectFormConfig) {
		this.projectFormConfig = projectFormConfig;
	}

	public ProjectMainDataValue copyFrom(ProjectMainData data, ProjectMainDataValue that) {
		if (that != null) {
			this.projectMainData = data;
			this.value = that.value;
			this.projectFormConfig = that.projectFormConfig;
		}
		return this;
	}

	@Override 
	public int compareTo(ProjectMainDataValue o) { 
		return this.getProjectFormConfig().getOrderNum().compareTo(o.getProjectFormConfig().getOrderNum()); 
	}
}
