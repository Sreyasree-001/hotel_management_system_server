package com.code.mvc.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long serviceid;
    @Column(name = "sername",nullable = false,length = 40)
    private String serviceName;
    @Column(name = "cost",nullable = false)
    private Double cost;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<ServiceRequest> serviceRequests;

    public List<ServiceRequest> getServiceRequests() {
        return serviceRequests;
    }

    public void setServiceRequests(List<ServiceRequest> serviceRequests) {
        this.serviceRequests = serviceRequests;
    }

    public long getServiceid() {
        return serviceid;
    }

    public void setServiceid(long serviceid) {
        this.serviceid = serviceid;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
