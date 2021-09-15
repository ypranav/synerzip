package com.synerzip.crud1.repos;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synerzip.crud1.enterprise.enterprise;
import com.synerzip.crud1.service.EnterpriseService;


@Repository
public interface repository extends JpaRepository<enterprise, Serializable> {
	

}
