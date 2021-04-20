package com.csye7250.project.webapp.entity;
import com.csye7250.project.webapp.entity.Property;
import javax.persistence.*;
import java.util.List;

@Entity
public class BusinessTerm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int businessId;
    private String BusinessDesc;
    private String BusType;

    @OneToOne
    @JoinColumn(name = "propertyId")
    private Property propertyId;

    @ManyToMany
    @JoinTable(
            name = "DomBusBridge",
            joinColumns = @JoinColumn(name = "dbName"),
            inverseJoinColumns = @JoinColumn(name = "businessId")
    )
    private List<Domain> domainList;

    public List<Domain> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<Domain> domainList) {
        this.domainList = domainList;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getBusinessDesc() {
        return BusinessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        BusinessDesc = businessDesc;
    }

    public String getBusType() {
        return BusType;
    }

    public void setBusType(String busType) {
        BusType = busType;
    }

    public Property getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Property propertyId) {
        this.propertyId = propertyId;
    }
}
