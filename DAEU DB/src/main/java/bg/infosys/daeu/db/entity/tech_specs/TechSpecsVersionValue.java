package bg.infosys.daeu.db.entity.tech_specs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Audited
@Entity
@Table(schema = "tech_specs" ,name = "tech_specs_version_values")
public class TechSpecsVersionValue implements Comparable<TechSpecsVersionValue> {
	@Id
	@SequenceGenerator(name = "tech_specs_version_values_seq", sequenceName = "tech_specs.tech_specs_version_values_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tech_specs_version_values_seq")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "tech_specs_version_id")
	private TechSpecsVersion techSpecsVersion;
	public static final String _techSpecsVersion = "techSpecsVersion";

	@Column(name = _value)
	private String value;
	public static final String _value = "value";

	@ManyToOne
	@JoinColumn(name = "tech_specs_form_config_id")
	private TechSpecsFormConfig techSpecsFormConfig;
	public static final String _techSpecsFormConfig = "techSpecsFormConfig";

	@ManyToOne
	@JoinColumn(name = "n_tech_specs_id")
	private TechSpecsType techSpecsType;
	public static final String _techSpecsType = "techSpecsType";

	public TechSpecsVersionValue() {

	}
	
	public TechSpecsVersionValue(TechSpecsFormConfig techSpecsFormConfig, TechSpecsVersion techSpecsVersion) {
		this.techSpecsFormConfig = techSpecsFormConfig;
		this.techSpecsVersion = techSpecsVersion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TechSpecsVersion getTechSpecsVersion() {
		return techSpecsVersion;
	}

	public void setTechSpecsVersion(TechSpecsVersion techSpecsVersion) {
		this.techSpecsVersion = techSpecsVersion;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public TechSpecsFormConfig getTechSpecsFormConfig() {
		return techSpecsFormConfig;
	}

	public void setTechSpecsFormConfig(TechSpecsFormConfig techSpecsFormConfig) {
		this.techSpecsFormConfig = techSpecsFormConfig;
	}

	public TechSpecsType getTechSpecsType() {
		return techSpecsType;
	}

	public void setTechSpecsType(TechSpecsType techSpecsType) {
		this.techSpecsType = techSpecsType;
	}
	
	public TechSpecsVersionValue copyFrom(TechSpecsVersionValue that) {
		if (that != null) {
			this.techSpecsFormConfig = that.getTechSpecsFormConfig();
			this.techSpecsType = that.getTechSpecsType();
			this.value = that.getValue();
		}
		
		return this;
	}

	@Override
	public int compareTo(TechSpecsVersionValue o) {
		return this.techSpecsFormConfig.getOrderNum() - o.getTechSpecsFormConfig().getOrderNum();
	}
}
