package com.example.app;

public class FlightStatusService {
    private final FlightAPI api;
    private final NotificationService notifier;

    public FlightStatusService(FlightAPI api, NotificationService notifier) {
        this.api = api;
        this.notifier = notifier;
    }

    public void handleFlightStatusCheck(String flightNumber) throws APIConnectionException {
        if (flightNumber == null || flightNumber.isEmpty()) {
            System.out.println("Brak numeru lotu.");
            return;
        }

        FlightStatus status = api.getFlightStatus(flightNumber);

        if (status == null) {
            System.out.println("Nie znaleziono lotu.");
            notifier.suggestCorrection();
        } else {
            System.out.println("Status lotu: " + status.getStatus());
            notifier.offerNotification(status);
        }
    }
}