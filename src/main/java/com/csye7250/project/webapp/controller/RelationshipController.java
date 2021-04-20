package com.csye7250.project.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.csye7250.project.webapp.service.RelationshipService;

@RestController
public class RelationshipController {

	private RelationshipService relService;
	
	@Autowired
	public RelationshipController(RelationshipService relService) {
		this.relService = relService;
	}
}
