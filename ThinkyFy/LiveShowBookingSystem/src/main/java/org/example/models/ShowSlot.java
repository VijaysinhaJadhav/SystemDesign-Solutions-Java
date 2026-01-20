package org.example.models;

import org.example.enums.SlotStatus;

import java.util.LinkedList;
import java.util.Queue;

public class ShowSlot {
    private final String startTime;
    private final String endTime;
    private int capacity;
    private SlotStatus status;
    private final Queue<String> waitlist = new LinkedList<>();

    public ShowSlot(String startTime, String endTime, int capacity) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
        this.status = SlotStatus.AVAILABLE;
    }

    public int getCapacity() {
        return capacity;
    }

    public void reduceCapacity(int count) {
        this.capacity -= count;
        if (capacity == 0) status = SlotStatus.BOOKED;
    }

    public void addToWaitlist(String user) {
        waitlist.add(user);
    }

    public Queue<String> getWaitlist() {
        return waitlist;
    }
}
