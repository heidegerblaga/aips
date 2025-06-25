package com.example.app;

public class EventBuilder {
    private Event event;

    public EventBuilder() {
        this.event = new Event();
    }

    public EventBuilder setTitle(String title) {
        event.setTitle(title);
        return this;
    }

    public EventBuilder setPriority(Priority p) {
        event.setPriority(p);
        return this;
    }

    public EventBuilder setReminder(String reminder) {
        event.setReminder(reminder);
        return this;
    }

    public EventBuilder setLifecycleStage(String stage) {
        event.setLifecycleStage(stage);
        return this;
    }

    public EventBuilder addParticipant(String email) {
        event.addParticipant(email);
        return this;
    }

    public EventBuilder addAttachment(String attachment) {
        event.addAttachment(attachment);
        return this;
    }

    public EventBuilder addTodoItem(String todo) {
        event.addTodoItem(todo);
        return this;
    }

    public Event build() {
        return event;
    }
}