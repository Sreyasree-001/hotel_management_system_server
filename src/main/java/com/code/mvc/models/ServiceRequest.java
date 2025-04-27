package com.code.mvc.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "service_request")
public class ServiceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long servReqId;
    @Column(name = "requestDate", nullable = false)
    private Date requestDate;
    @Column(name = "reqStatus",nullable = false)
    private String reqStatus;
    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "serviceid", nullable = false)
    private Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public long getServReqId() {
        return servReqId;
    }

    public void setServReqId(long servReqId) {
        this.servReqId = servReqId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
