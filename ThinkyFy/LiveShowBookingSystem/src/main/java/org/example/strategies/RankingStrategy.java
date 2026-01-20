package org.example.strategies;

import org.example.models.ShowSlot;

import java.util.List;

public interface RankingStrategy {
    List<ShowSlot> rank(List<ShowSlot> slots);
}
