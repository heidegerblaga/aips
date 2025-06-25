package com.example.app;

public interface FlightAPI {
    FlightStatus getFlightStatus(String flightNumber) throws APIConnectionException;
}