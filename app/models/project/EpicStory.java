package models.project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.BaseEntity;

@Entity
public class EpicStory extends BaseEntity{

	@ManyToOne 
	private Project project;
	
	private ProjectEpic projectEpic;
	
	private String storyName;
	
	private Long storyId;
	
	private List<StoryTask> storyTaskList = new ArrayList<StoryTask>();
	
	@ManyToOne
	private ProjectMember epicOwner;
	
	
}
