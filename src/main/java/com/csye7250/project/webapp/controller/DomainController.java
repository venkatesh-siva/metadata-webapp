package com.csye7250.project.webapp.controller;

import com.csye7250.project.webapp.entity.Domain;
import com.csye7250.project.webapp.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DomainController {
    @Autowired
    private DomainService domainService;

    @GetMapping("/getDomains")
    public List<Domain> getAllDomains() {
        return domainService.getAllDomains();
    }

    @GetMapping("/getByDBName")
    public List<Domain> findByDBName(@RequestParam("dbName") String dbName) {
        return domainService.findByDBName(dbName);
    }
}
