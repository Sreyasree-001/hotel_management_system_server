package com.code.mvc.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long bookingid;
    @Column(name = "checkin",nullable = false)
    private Date checkin;
    @Column(name = "checkout")
    private Date checkout;
    @Column(name = "status",length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "custId", nullable = false)
    private Customer customer;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getBookingid() {
        return bookingid;
    }

    public void setBookingid(long bookingid) {
        this.bookingid = bookingid;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
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
}
