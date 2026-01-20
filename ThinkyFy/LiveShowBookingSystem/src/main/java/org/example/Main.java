package org.example;

import org.example.enums.Genre;
import org.example.repositories.BookingRepository;
import org.example.repositories.ShowRepository;
import org.example.services.BookingService;
import org.example.services.ShowService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShowRepository showRepo = new ShowRepository();
        BookingRepository bookingRepo = new BookingRepository();

        ShowService showService = new ShowService(showRepo);
        BookingService bookingService = new BookingService(bookingRepo, showRepo);

        showService.registerShow("TMKOC", Genre.COMEDY);
        showService.onboardSlot("TMKOC", "9:00", "10:00", 3);

        String bookingId = bookingService.bookTicket("UserA", "TMKOC", "9:00", 2);
        System.out.println("Booked. Booking id: " + bookingId);
    }
}