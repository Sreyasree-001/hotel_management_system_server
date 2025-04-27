package com.code.mvc.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long roomId;
    @Column(name = "roomNo", nullable = false,length = 3, unique = true)
    private String roomNumber;
    @Column(name = "roomType", nullable = false,unique = false,length = 10)
    private String roomType;
    @Column(name= "price", nullable = false, unique = false)
    private Double price;
    @Column(name = "isAvailable", nullable = false,unique = false)
    private Boolean isAvailable;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<ServiceRequest> serviceRequests;

    public List<ServiceRequest> getServiceRequests() {
        return serviceRequests;
    }

    public void setServiceRequests(List<ServiceRequest> serviceRequests) {
        this.serviceRequests = serviceRequests;
    }

    public long getId() {
        return roomId;
    }

    public void setId(long id) {
        this.roomId = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
