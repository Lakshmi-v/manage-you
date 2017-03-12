package models.project;

import java.util.Date;

import javax.persistence.Entity;

import models.BaseEntity;

@Entity
public class EpicMember extends BaseEntity{
	
	private Project project;
	
	private ProjectMember projectMember;
	
	private Boolean isActive = Boolean.TRUE;
	
	private Date startDate;
	
	private Date closeDate;
	

}
