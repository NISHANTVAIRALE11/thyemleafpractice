package com.practice.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	  @NotBlank(message="userName not be empty !!")
	  @Size(min = 3,max = 12 ,message="must contain 3 to 12 char !!")
	  private String userName;
	  
	  @Pattern(regexp = "@\"^([0-9a-zA-Z]([-\\.\\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\\w]*[0-9a-zA-Z]\\.)+[com]{2,9})$",message="must contain valid email")
	  private String email;
	  
	// private Agree agree ;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	 
}
