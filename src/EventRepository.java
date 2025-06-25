package com.example.app;

import java.util.*;

public class EventRepository {
    private List<Event> events = new ArrayList<>();

    public void save(Event event) {
        events.add(event);
        System.out.println("Wydarzenie zapisane: " + event.getTitle());
    }

    public List<Event> filterByPriority(Priority priority) {
        List<Event> result = new ArrayList<>();
        for (Event e : events) {
            if (e.getPriority() == priority) {
                result.add(e);
            }
        }
        return result;
    }
}