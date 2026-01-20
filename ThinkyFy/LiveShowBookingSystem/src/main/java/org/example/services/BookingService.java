package org.example.services;

import org.example.models.Booking;
import org.example.repositories.BookingRepository;
import org.example.repositories.ShowRepository;

import java.util.UUID;

public class BookingService {

    private final BookingRepository bookingRepo;
    private final ShowRepository showRepo;

    public BookingService(BookingRepository bookingRepo, ShowRepository showRepo) {
        this.bookingRepo = bookingRepo;
        this.showRepo = showRepo;
    }

    public String bookTicket(String user, String showName, String slot, int persons) {
        String id = UUID.randomUUID().toString();
        Booking booking = new Booking(id, user, showName, slot, persons);
        bookingRepo.save(booking);
        return id;
    }

    public void cancelBooking(String bookingId) {
        bookingRepo.delete(bookingId);
    }
}
