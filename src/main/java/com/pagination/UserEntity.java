package com.pagination;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString*/
@Entity(name = "user_details")
public class UserEntity {

	@Id
	String user;
	String username;
	String password;

	
	  public UserEntity(String user, String username, String password) { super();
	  this.user = user; this.username = username; this.password = password; }
	  
	  public String getUser() { return user; }
	  
	  public void setUser(String user) { this.user = user; }
	  
	  public String getUsername() { return username; }
	  
	  public void setUsername(String username) { this.username = username; }
	  
	  public String getPassword() { return password; }
	  
	  public void setPassword(String password) { this.password = password; }
	  
	  public UserEntity() {
		  super(); // TODO Auto-generated constructor stub 
	  }
	  }
	 

 
