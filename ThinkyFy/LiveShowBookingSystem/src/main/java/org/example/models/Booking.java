package org.example.models;

public class Booking {
    private final String bookingId;
    private final String user;
    private final String showName;
    private final String slotTime;
    private final int persons;

    public Booking(String bookingId, String user, String showName,
                   String slotTime, int persons) {
        this.bookingId = bookingId;
        this.user = user;
        this.showName = showName;
        this.slotTime = slotTime;
        this.persons = persons;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUser() {
        return user;
    }
}
