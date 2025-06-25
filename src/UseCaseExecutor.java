package com.example.app;

public class UseCaseExecutor {

    public void executeAddEventUseCase() {
        User user = new User("Jan Kowalski", "jan@example.com");

        Event event = new EventBuilder()
            .setTitle("Spotkanie projektowe")
            .setPriority(Priority.HIGH)
            .setReminder("1 dzień przed")
            .setLifecycleStage("Zaplanowane")
            .addParticipant("anna@example.com")
            .addAttachment("projekt_specyfikacja.pdf")
            .addTodoItem("Przygotować agendę")
            .build();

        EventService eventService = new EventService(new EventRepository(), new ScheduleSynchronizer());
        eventService.createEvent(user, event);
    }

    public void executeFlightStatusUseCase() {
        FlightAPI api = new MockFlightAPI();
        FlightStatusService service = new FlightStatusService(api, new NotificationService());

        try {
            service.handleFlightStatusCheck("LO1234");
        } catch (APIConnectionException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}