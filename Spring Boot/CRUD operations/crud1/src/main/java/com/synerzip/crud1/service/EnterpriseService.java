package com.synerzip.crud1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synerzip.crud1.enterprise.enterprise;
import com.synerzip.crud1.repos.repository;

@Service
public class EnterpriseService {
 
  @Autowired
  private repository repo;
  
  public void saveOrUpdateData() {
		enterprise user = new enterprise();
		user.setUserID(102);
		user.setUsername("Pranav");
		user.setAge(100);
		repo.save(user);	
	}
  
	public void deleteData() {
		repo.deleteById(102);		
	}
		
	public void fetchData(){	
		List<enterprise> findAll = repo.findAll();
		System.out.println(findAll);	
	} 
	  
	 
}
