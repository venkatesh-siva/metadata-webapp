package com.csye7250.project.webapp.controller;

import com.csye7250.project.webapp.entity.Domain;
import com.csye7250.project.webapp.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DomainController {
    @Autowired
    private DomainService domainService;

    @GetMapping("/getDomains")
    public List<Domain> getAllDomains() {
        List<Domain> list = domainService.getAllDomains();
        return list;
    }
}
