package models.project;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.BaseEntity;

@Entity
public class ProjectMember extends BaseEntity{
	
	@ManyToOne
	private Project project;
	
	private MemberRole memberRole;
	
	private Date joinDate;
	
	private Date releavedDate;
	

}
