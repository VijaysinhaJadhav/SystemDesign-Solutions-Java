package org.example.services;

import org.example.enums.Genre;
import org.example.models.LiveShow;
import org.example.models.ShowSlot;
import org.example.repositories.ShowRepository;

public class ShowService {

    private final ShowRepository showRepository;

    public ShowService(ShowRepository repo) {
        this.showRepository = repo;
    }

    public void registerShow(String name, Genre genre) {
        showRepository.save(new LiveShow(name, genre));
    }

    public void onboardSlot(String showName, String start, String end, int capacity) {
        LiveShow show = showRepository.findByName(showName);
        show.getSlots().put(start, new ShowSlot(start, end, capacity));
    }
}
