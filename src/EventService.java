package com.example.app;

public class EventService {
    private final EventRepository repository;
    private final ScheduleSynchronizer synchronizer;

    public EventService(EventRepository repository, ScheduleSynchronizer synchronizer) {
        this.repository = repository;
        this.synchronizer = synchronizer;
    }

    public void createEvent(User user, Event event) {
        repository.save(event);
        synchronizer.sync(user);
    }
}