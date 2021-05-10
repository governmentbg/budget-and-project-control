package bg.infosys.daeu.db.entity.tech_specs;

import java.util.Date;

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
import org.hibernate.validator.constraints.Length;

@Audited
@Entity
@Table(schema = "tech_specs" ,name = "tech_specs_mail_logs")
public class TechSpecsMailLog {
	@Id
	@SequenceGenerator(name = "tech_specs_mail_logs_seq", sequenceName = "tech_specs.tech_specs_mail_logs_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tech_specs_mail_logs_seq")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "tech_specs_version_id")
	private TechSpecsVersion techSpecsVersion;
	public static final String _techSpecsVersion = "techSpecsVersion";
	
	@Column(name = "mail_text")
	@Length(max = 4096)
	private String mailText;
	public static final String _mailText = "mailText";
	
	@Column(name = _status)
	@Length(max = 8)
	private String status;
	public static final String _status = "status";
	
	@Column(name = "mail_subject")
	@Length(max = 256)
	private String mailSubject;
	public static final String _mailSubject = "mailSubject";
	
	@Column(name = "mail_date", columnDefinition = "TIMESTAMP")
	private Date mailDate;
	public static final String _mailDate = "mailDate";
	
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
	
	public String getMailText() {
		return mailText;
	}
	
	public void setMailText(String mailText) {
		this.mailText = mailText;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMailSubject() {
		return mailSubject;
	}
	
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}
	
	public Date getMailDate() {
		return mailDate;
	}
	
	public void setMailDate(Date mailDate) {
		this.mailDate = mailDate;
	}
}
