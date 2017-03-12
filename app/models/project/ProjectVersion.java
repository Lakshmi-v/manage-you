package models.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import models.BaseEntity;

@Entity
public class ProjectVersion extends BaseEntity{
	
	@ManyToOne
	private Project project;
	
	private String versionName;
	
	private Integer versionSequence;
	
	private Date startDate;
	
	private Date releasedDate;
	
	private List<ProjectMember> projectMembersInvolved = new ArrayList<ProjectMember>();
	

}
