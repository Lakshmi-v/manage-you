package models.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import models.BaseEntity;

@Entity 
public class Project extends BaseEntity{
	
	private String projectName;
	
	private String ownerName;
	
	private Date startDate;
	
	private Date closeDate;
	
	private List<ProjectVersion> projectVersionList = new ArrayList<ProjectVersion>(); 
	
	private List<ProjectMember> projectMemberList = new ArrayList<ProjectMember>();

	private List<ProjectEpic> projectEpicList = new ArrayList<ProjectEpic>();
	
	
	
}
