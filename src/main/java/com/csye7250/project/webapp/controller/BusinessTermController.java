package com.csye7250.project.webapp.controller;

import com.csye7250.project.webapp.entity.BusinessTerm;
import com.csye7250.project.webapp.exception.BusinessTermException;
import com.csye7250.project.webapp.service.BusinessTermService;
import com.csye7250.project.webapp.util.CustomStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BusinessTermController {

    private BusinessTermService businessTermService;

    @Autowired
    public BusinessTermController(BusinessTermService bTermService){
        this.businessTermService=bTermService;
    }

    @GetMapping("/businessterms")
    public ResponseEntity<List<BusinessTerm>> getAllBusinessTerms() throws BusinessTermException {

        List<BusinessTerm> bussTerms = this.businessTermService.getAllbusinessTerms();

        if(null!=bussTerms && bussTerms.size()>0)
            return new ResponseEntity(bussTerms, HttpStatus.valueOf(200));
        else
            throw new BusinessTermException(CustomStrings.notFound);
    }

//    @GetMapping("/businessterms")
//    public ResponseEntity<List<BusinessTerm>> getBusinessTermsByDomain(@RequestParam("domain") String domainName) throws BusinessTermException {
//
//        List<BusinessTerm> bussTerms = this.businessTermService.getBusinessTermsByDomain(domainName);
//
//        if(null!=bussTerms && bussTerms.size()>0)
//            return new ResponseEntity(bussTerms, HttpStatus.valueOf(200));
//        else
//            throw new BusinessTermException(CustomStrings.notFound);
//    }

    @GetMapping("/businessterms")
    public ResponseEntity<BusinessTerm> getBusinessTermsByDomain(@RequestParam("property") int propertyId) throws BusinessTermException {

        BusinessTerm bussTerm = this.businessTermService.getBusinessTermsByProperty(propertyId);

        if(null!=bussTerm )
            return new ResponseEntity(bussTerm, HttpStatus.valueOf(200));
        else
            throw new BusinessTermException(CustomStrings.notFound);
    }

}
