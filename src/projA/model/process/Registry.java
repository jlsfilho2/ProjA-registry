package projA.model.process;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table
public class Registry  {
	
	@Id
	@Column
	@Type(type = "org.hibernate.type.UUIDCharType")
	String id;
	
	@Column
	String idReference;
	
	@Column
	String idActor;
	
	
	@Column
	String signature;
	
	@Lob
	@Column
	String details;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	Date date;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdReference() {
		return idReference;
	}

	public void setIdReference(String idReference) {
		this.idReference = idReference;
	}

	public String getIdActor() {
		return idActor;
	}

	public void setIdActor(String idActor) {
		this.idActor = idActor;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	

	
	
}
