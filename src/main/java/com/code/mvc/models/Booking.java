package com.code.mvc.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long bookingId;

    @Column(name = "checkIn", nullable = false)
    private Date checkIn;

    @Column(name = "checkout")
    private Date checkout;

    @Column(name = "status", length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    @com.fasterxml.jackson.annotation.JsonBackReference
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    @com.fasterxml.jackson.annotation.JsonBackReference
    private Room room;


    // Getters and Setters
    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Booking(){
        this.bookingId=0;
        this.checkIn=null;
        this.checkout=null;
        this.status=null;
    }
    public Booking(long bookingId,Date checkIn, Date checkout, String status){
        super();
        this.bookingId=bookingId;
        this.checkIn=checkIn;
        this.checkout=checkout;
        this.status=status;
    }
}
