package org.example.strategies;

import org.example.models.ShowSlot;

import java.util.Comparator;
import java.util.List;

public class StartTimeRankingStrategy implements RankingStrategy {
    @Override
    public List<ShowSlot> rank(List<ShowSlot> slots) {
        slots.sort(Comparator.comparing(s -> s.toString()));
        return slots;
    }
}
