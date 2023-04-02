package projA.model.process;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


public class ModelRegistry extends Registry {

	@Column
	String step;
	
	
	@Enumerated(EnumType.STRING)
	@Column
	EventProcessType eventProcessType; 
	
	
	enum EventProcessType {
			EXCEPTION, CONCLUSE_STEP, EXPIRE, FINALY, START
	}
	
	
	
}
