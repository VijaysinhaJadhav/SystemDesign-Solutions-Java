package org.example.repositories;

import org.example.models.Booking;

import java.util.HashMap;
import java.util.Map;

public class BookingRepository {
    private final Map<String, Booking> bookings = new HashMap<>();

    public void save(Booking booking) {
        bookings.put(booking.getBookingId(), booking);
    }

    public Booking findById(String id) {
        return bookings.get(id);
    }

    public void delete(String id) {
        bookings.remove(id);
    }
}
