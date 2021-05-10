package bg.infosys.daeu.db.entity.budgets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Audited
@Entity
@Table(schema = "budgets", name = "n_row_value_types")
public class RowValueType {

	@Id
	@Column(name = _code, nullable = false)
	private String code;
	public static final String _code = "code";
	
	@Column(name = _name)
	private String name;
	public static final String _name = "name";
	
	@Column(name = "is_valid")
	private String isValid;
	public static final String _isValid = "isValid";
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsValid() {
		return isValid;
	}
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	} 
	
	
}
