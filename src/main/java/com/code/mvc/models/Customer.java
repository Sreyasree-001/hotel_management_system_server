package com.code.mvc.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long customerId;

    @Column(name = "name", length = 100, nullable = false, unique = false)
    private String customerName;
    @Column(name = "email", length=50, nullable = false, unique = true)
    private String customerEmail;
    @Column(name = "phoneNo", length = 20,nullable = false, unique = true)
    private String phoneNo;
    @Column(name = "address", length = 150, nullable = false, unique = false)
    private String address;

    @OneToMany(mappedBy = "customer")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private List<Booking> bookings;


    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }



    public Customer(){
        this.customerName=null;
        this.customerEmail=null;
        this.phoneNo=null;
        this.address=null;
    }
    public Customer(String custname,String custemail, String phoneno, String address){
        super();
        this.customerName=custname;
        this.customerEmail=custemail;
        this.phoneNo=phoneno;
        this.address=address;
    }
}
