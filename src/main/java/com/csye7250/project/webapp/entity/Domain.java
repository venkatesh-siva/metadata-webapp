package com.csye7250.project.webapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Domain")
public class Domain {

    @Id
    private String dbName;
    @Column
    private String domainName;

    @ManyToMany
    private List<BusinessTerm> busTermList;

    public List<BusinessTerm> getBusTermList() {
        return busTermList;
    }

    public void setBusTermList(List<BusinessTerm> busTermList) {
        this.busTermList = busTermList;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
