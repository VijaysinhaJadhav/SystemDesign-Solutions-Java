package org.example.repositories;

import org.example.models.LiveShow;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShowRepository {
    private final Map<String, LiveShow> shows = new HashMap<>();

    public void save(LiveShow show) {
        shows.put(show.getName(), show);
    }

    public LiveShow findByName(String name) {
        return shows.get(name);
    }

    public Collection<LiveShow> findAll() {
        return shows.values();
    }
}
