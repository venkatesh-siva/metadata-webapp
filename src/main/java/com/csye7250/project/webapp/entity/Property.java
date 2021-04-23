package com.csye7250.project.webapp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyId;
	
	private String techTerm;
	
	private String uniqueConstraints;
	
	private int nodeId;
	
	private String existingConstraints;
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="propertyList")
	private List<BusinessTerm> bTermList ;

	public List<BusinessTerm> getbTermList() {
		return bTermList;
	}

	public void setbTermList(List<BusinessTerm> bTermList) {
		this.bTermList = bTermList;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getTechTerm() {
		return techTerm;
	}

	public void setTechTerm(String techTerm) {
		this.techTerm = techTerm;
	}

	public String getUniqueConstraints() {
		return uniqueConstraints;
	}

	public void setUniqueConstraints(String uniqueConstraints) {
		this.uniqueConstraints = uniqueConstraints;
	}

	public int getNodeId() {
		return nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	public String getExistingConstraints() {
		return existingConstraints;
	}

	public void setExistingConstraints(String existingConstraints) {
		this.existingConstraints = existingConstraints;
	}
	
}
