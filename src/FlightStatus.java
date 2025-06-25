package com.example.app;

public class FlightStatus {
    private String flightNumber;
    private String status;

    public FlightStatus(String flightNumber, String status) {
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public String getStatus() { return status; }
}