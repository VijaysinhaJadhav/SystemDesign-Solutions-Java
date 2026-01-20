package org.example.models;

import org.example.enums.Genre;

import java.util.HashMap;
import java.util.Map;

public class LiveShow {
    private final String name;
    private final Genre genre;
    private final Map<String, ShowSlot> slots = new HashMap<>();

    public LiveShow(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Map<String, ShowSlot> getSlots() {
        return slots;
    }
}
