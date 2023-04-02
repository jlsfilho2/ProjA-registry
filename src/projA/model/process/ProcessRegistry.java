package projA.model.process;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ProcessRegistry extends Registry {

	@Enumerated(EnumType.STRING)
	@Column
	EventModelType eventModelType;

	enum EventModelType {
		ADD_VARIABLE, REMOVE_VARIABLE, ALTER_VARIABLE, ADD_STEP, REMOVE_STEP, ALTER_STEP
	}

}
