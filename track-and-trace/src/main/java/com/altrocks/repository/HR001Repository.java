package com.altrocks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altrocks.model.HR001;

@Repository
public interface HR001Repository extends JpaRepository<HR001, Long>{


	//void save(List inBound);

	

}
