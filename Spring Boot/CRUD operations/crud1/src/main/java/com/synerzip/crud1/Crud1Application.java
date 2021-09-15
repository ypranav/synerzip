package com.synerzip.crud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.synerzip.crud1.enterprise.enterprise;
import com.synerzip.crud1.repos.repository;
import com.synerzip.crud1.service.EnterpriseService;

@SpringBootApplication
public class Crud1Application {	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Crud1Application.class, args);
		

		EnterpriseService bean = run.getBean(EnterpriseService.class);
		bean.saveOrUpdateData();
		bean.fetchData();
		bean.deleteData();
	
	    run.close();  
	
	}

}
