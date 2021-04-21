package com.csye7250.project.webapp.service;

import com.csye7250.project.webapp.repository.BusinessTermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessTermService {

    private BusinessTermRepository businessTermRepo;

    @Autowired
    public BusinessTermService( BusinessTermRepository businessTermRepository){
        this.businessTermRepo=businessTermRepository;
    }


}
