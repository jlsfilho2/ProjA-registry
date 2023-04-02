package projA.model.schedule;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;

@Entity
@Table
public class Schedule  {
	
	@Id
	@Column
	@Type(type = "org.hibernate.type.UUIDCharType")
	String id;
	
	@Column
	String idProcess;
	
	@Column
	String idStep;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	Date dateSchedule;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	Date dateExecute;
	
	
	@Enumerated(EnumType.STRING)
	@Column
	EventScheduleType eventSchedule; 
	
	
	enum EventScheduleType {
			ADVANCE
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	

	
	
}
