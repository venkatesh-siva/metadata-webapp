package com.csye7250.project.webapp.service;

import com.csye7250.project.webapp.entity.BusinessTerm;
import com.csye7250.project.webapp.exception.BusinessTermException;
import com.csye7250.project.webapp.repository.BusinessTermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessTermService {

    private BusinessTermRepository businessTermRepo;

    @Autowired
    public BusinessTermService( BusinessTermRepository businessTermRepository){
        this.businessTermRepo=businessTermRepository;
    }


    public List<BusinessTerm> getAllbusinessTerms() throws BusinessTermException {
        List<BusinessTerm> bussTerms = new ArrayList<>();
        try{
           this.businessTermRepo.findAll().forEach( bussTerms::add);
           return bussTerms;
        }catch (Exception e){
            throw new BusinessTermException(e.getMessage());
        }
    }


    public BusinessTerm savebusinessTerm(BusinessTerm bterm)throws BusinessTermException {

        try{
            return this.businessTermRepo.save(bterm);
        }catch (Exception e ){
            throw  new BusinessTermException(e.getMessage());
        }

    }
}
