package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.College;

/*jpa repo. is an interface which contains all jpa 
crud ops required for spring boot*/

public interface CollegeRepository extends JpaRepository<College,Integer> {
		
	
}
