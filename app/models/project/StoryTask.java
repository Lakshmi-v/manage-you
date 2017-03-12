package models.project;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.BaseEntity;

@Entity
public class StoryTask extends BaseEntity{
	
	@ManyToOne 
	private Project project;
	
	@ManyToOne 
	private ProjectEpic projectEpic;
	
	@ManyToOne
	private EpicStory epicStory;
	
	private String taskName;
	
	private String description;
	
	private TaskType taskType;
	
	
	
	
	

}
