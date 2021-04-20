package com.csye7250.project.webapp.controller;

import com.csye7250.project.webapp.service.BusinessTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessTermController {

    private BusinessTermService businessTermService;

    @Autowired
    public BusinessTermController(BusinessTermService bTermService){
        this.businessTermService=bTermService;
    }
}
