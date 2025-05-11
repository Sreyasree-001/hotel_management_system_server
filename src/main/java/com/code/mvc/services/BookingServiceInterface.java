package com.code.mvc.services;

import com.code.mvc.models.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingServiceInterface {
    Booking createBooking(Booking booking);
    Optional<Booking> getBookingById(long id);
    List<Booking> getAllBookings();
    List<Booking> getBookingsByCustomerId(long customerId);
    boolean deleteBooking(long id);
    Booking updateBooking(long id, Booking booking);
}
