package projA.model.process;
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
public class Snapshot  {
	
	@Id
	@Column
	@Type(type = "org.hibernate.type.UUIDCharType")
	String id;
	
	
	@Column
	String processModel;
	
	
	@Column
	String step;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	Date dateVerify;
	
	@Column
	Long latest;
	
	
	@Column
	Long amount;
	
	
	@Column
	Long advanced;
	
	
}
