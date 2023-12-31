package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.Heritage;

public interface HeritageRepository extends JpaRepository<Heritage, Integer> {
	
	@Query("SELECT h FROM Heritage h WHERE h.destName = :n")
	Heritage findHeritageDestByName(@Param("n") String name);
}