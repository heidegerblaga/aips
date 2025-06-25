package com.example.app;

public class MockFlightAPI implements FlightAPI {
    public FlightStatus getFlightStatus(String flightNumber) throws APIConnectionException {
        if ("FAIL".equals(flightNumber)) {
            throw new APIConnectionException("Brak połączenia z API.");
        } else if ("NOTFOUND".equals(flightNumber)) {
            return null;
        }
        return new FlightStatus(flightNumber, "Planowany");
    }
}