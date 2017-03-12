package models.project;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.BaseEntity;
import models.constants.TaskPriority;

@Entity
public class TaskType extends BaseEntity{
	
	@ManyToOne
	private Project project;
	
	public String taskType;
	
	private String taskColor;
	
	private TaskPriority taskPriority;
	
	private Boolean isActive = Boolean.TRUE;
	
}
