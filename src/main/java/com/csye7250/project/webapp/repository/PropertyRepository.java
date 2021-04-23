package com.csye7250.project.webapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csye7250.project.webapp.entity.Property;

public interface PropertyRepository extends CrudRepository<Property, Integer> {
	List<Property> findByNodeId(Integer nodeId);
}
