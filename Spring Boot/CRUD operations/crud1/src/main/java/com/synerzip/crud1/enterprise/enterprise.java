package com.synerzip.crud1.enterprise;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class enterprise {
    
	
	@Id
	private int UserID;
	private String Username;
	private int age;
	
	@Override
	public String toString() {
		return "enterprise [UserID=" + UserID + ", Username=" + Username + ", age=" + age + "]";
	}

	
	public int getUserID() {
		return UserID;
	}


	public void setUserID(int userID) {
		UserID = userID;
	}


	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}