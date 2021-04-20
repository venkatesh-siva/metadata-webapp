package com.csye7250.project.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.csye7250.project.webapp.service.PropertyService;

@RestController
public class PropertyController {
	
	private PropertyService propertyService;
	
	@Autowired
	public PropertyController(PropertyService propertyService) {
		this.propertyService = propertyService;
	}
}
