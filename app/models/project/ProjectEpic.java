package models.project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.BaseEntity;

@Entity
public class ProjectEpic extends BaseEntity{
	
	@ManyToOne
	private Project project;
	
	private Long epicId;
	
	private String epicName;
	
	private String description;
	
	//ManyToMany
	private List<ProjectMember> followers = new ArrayList<ProjectMember>();
	
	private List<EpicStory> epicStories = new ArrayList<EpicStory>();
	
	

}
