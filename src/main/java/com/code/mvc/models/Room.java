package com.code.mvc.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long roomId;

    @Column(name = "roomNo", nullable = false, length = 10, unique = true)
    private long roomNo;

    @Column(name = "roomType", nullable = false, length = 10)
    private String roomType;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "isAvailable", nullable = false)
    private boolean isAvailable;

    // Getters and Setters
    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getRoomNumber() {
        return roomNo;
    }

    public void setRoomNumber(long roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public Room(){
        this.roomNo=0;
        this.roomType=null;
        this.price=null;
        this.isAvailable=false;
    }
    public Room(long roomNo,String roomType,BigDecimal price, boolean isAvailable){
        super();
        this.roomNo=roomNo;
        this.roomType=roomType;
        this.price=price;
        this.isAvailable=isAvailable;
    }
}
