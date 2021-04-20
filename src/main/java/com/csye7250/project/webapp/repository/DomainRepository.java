package com.csye7250.project.webapp.repository;

import com.csye7250.project.webapp.entity.Domain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DomainRepository extends CrudRepository<Domain, Long> {

    List<Domain> findByName(String dbName);
}
