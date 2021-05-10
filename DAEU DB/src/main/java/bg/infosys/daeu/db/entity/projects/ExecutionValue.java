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
@Table(schema = "projects", name = "execution_values")
public class ExecutionValue  implements Comparable<ExecutionValue> {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "execution_data_id")
	private ExecutionData executionData;
	public static final String _executionData = "executionData";

	@Column(name = _value)
	private String value;
	public static final String _value = "value";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_form_config_id")
	private ProjectFormConfig projectFormConfig;
	public static final String _projectFormConfig = "projectFormConfig";

	public ExecutionValue() {}

	public ExecutionValue(ExecutionData executionData, ProjectFormConfig projectFormConfig) {
		this.executionData = executionData;
		this.projectFormConfig = projectFormConfig;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ExecutionData getExecutionData() {
		return executionData;
	}

	public void setExecutionData(ExecutionData executionData) {
		this.executionData = executionData;
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

	public ExecutionValue copyFrom(ExecutionData data, ExecutionValue that) {
		if (that != null) {
			this.executionData = data;
			this.value = that.value;
			this.projectFormConfig = that.projectFormConfig;
		}
		return this;
	}

	@Override 
	public int compareTo(ExecutionValue o) { 
		return this.getProjectFormConfig().getOrderNum().compareTo(o.getProjectFormConfig().getOrderNum()); 
	}

}
