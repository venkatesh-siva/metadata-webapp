package com.csye7250.project.webapp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Nodes")
public class Node {
    @Id
    private int nodeId;
    @Column
    private String label;
    @Column
    private int counts;
    @Column
    private String dbName;
    
    @OneToMany
	@JoinColumn(name = "propertyId")
    private List<Property> props;
    
    @OneToMany
	@JoinColumn(name = "relationshipId")
    private List<Relationship> relList;

    public List<Property> getProps() {
		return props;
	}

	public void setProps(List<Property> props) {
		this.props = props;
	}

	public List<Relationship> getRelList() {
		return relList;
	}

	public void setRelList(List<Relationship> relList) {
		this.relList = relList;
	}

	public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}

