package models;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;


public abstract class BaseEntity extends Model{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@CreatedTimestamp
	public Timestamp createdOn;
	
	@Version
	public Timestamp lastUpdate;
	
	@ManyToOne
	private AppUser createdBy;
	
	
}
