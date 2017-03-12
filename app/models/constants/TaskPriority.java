package models.constants;

import com.avaje.ebean.annotation.EnumValue;

public enum TaskPriority {
	
	@EnumValue("HIGH_PRIORITY")
	HIGH_PRIORITY,
	
	@EnumValue("MEDIUM_PRIORITY")
	MEDIUM_PRIORITY,
	
	@EnumValue("LOW_PRIORITY")
	LOW_PRIORITY,
	
	@EnumValue("LEAST_PRIORITY")
	LEAST_PRIORITY;
	
}
