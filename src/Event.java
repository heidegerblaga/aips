package com.example.app;

import java.util.*;

public class Event {
    private String title;
    private Priority priority;
    private String reminder;
    private String lifecycleStage;
    private List<String> participants = new ArrayList<>();
    private List<String> attachments = new ArrayList<>();
    private List<String> todoList = new ArrayList<>();

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }
    public void setPriority(Priority priority) { this.priority = priority; }
    public Priority getPriority() { return priority; }
    public void setReminder(String reminder) { this.reminder = reminder; }
    public void setLifecycleStage(String lifecycleStage) { this.lifecycleStage = lifecycleStage; }
    public void addParticipant(String email) { participants.add(email); }
    public void addAttachment(String file) { attachments.add(file); }
    public void addTodoItem(String item) { todoList.add(item); }
}