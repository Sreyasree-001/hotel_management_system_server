package com.code.mvc.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long custId;

    @Column(name = "name", length = 100, nullable = false, unique = false)
    private String custname;
    @Column(name = "email", length=50, nullable = false, unique = true)
    private String custemail;
    @Column(name = "phoneno", length = 20,nullable = false, unique = true)
    private String phoneno;
    @Column(name = "address", length = 150, nullable = false, unique = false)
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custid) {
        this.custId = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(){
        this.custname=null;
        this.custemail=null;
        this.phoneno=null;
        this.address=null;
    }
    public Customer(String custname,String custemail, String phoneno, String address){
        super();
        this.custname=custname;
        this.custemail=custemail;
        this.phoneno=phoneno;
        this.address=address;
    }
}
