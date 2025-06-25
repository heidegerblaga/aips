package com.example.app;

public class NotificationService {
    public void offerNotification(FlightStatus status) {
        System.out.println("Czy chcesz powiadomienie o zmianie statusu lotu?");
    }

    public void suggestCorrection() {
        System.out.println("Sprawdź numer lotu lub wybierz jeden z podobnych.");
    }
}