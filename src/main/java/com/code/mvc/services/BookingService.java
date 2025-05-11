package com.code.mvc.services;

import com.code.mvc.models.Booking;
import com.code.mvc.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService implements BookingServiceInterface {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<Booking> getBookingById(long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public List<Booking> getBookingsByCustomerId(long customerId) {
        return bookingRepository.findByCustomerCustomerId(customerId);
    }

    @Override
    public boolean deleteBooking(long id) {
        Optional<Booking> booking = bookingRepository.findById(id);
        if (booking.isPresent()) {
            bookingRepository.delete(booking.get());
            return true;
        }
        return false;
    }

    @Override
    public Booking updateBooking(long id, Booking booking) {
        Optional<Booking> existingBooking = bookingRepository.findById(id);
        if (existingBooking.isPresent()) {
            booking.setBookingId(id);
            return bookingRepository.save(booking);
        }
        return null;
    }
}
