package models.project;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.BaseEntity;

@Entity
public class MemberRole extends BaseEntity{
	
	@ManyToOne
	private Project project;
	
	private String role;
	
	private boolean isActive = Boolean.TRUE;
	
	

}
