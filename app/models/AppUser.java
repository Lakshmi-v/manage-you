package models;

import javax.persistence.Entity;

@Entity
public class AppUser extends BaseEntity{
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String salt;
	
	private String mobileNumber;
	
	private String role;
	
	

}
