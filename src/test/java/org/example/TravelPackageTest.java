package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravelPackageTest {

    @Test
    void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation Package", 50);
        Passenger passenger1 = new StandardPassenger("John", 1, 100.0);
        Passenger passenger2 = new StandardPassenger("Alice", 2, 100.0);

        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        // Check if passengers are added to the travel package successfully
        assertEquals(2, travelPackage.getPassengers().size());
    }

    @Test
    void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation Package", 50);
        Destination destination = new Destination("Beach Resort");

        travelPackage.addDestination(destination);

        // Check if the destinations are added successfully
        assertEquals(1, travelPackage.getDestinations().size());
    }

    @Test
    void testPrintItinerary() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation Package", 50);
        Destination destination = new Destination("Beach Resort");
        Activity activity1 = new Activity("Beach Volleyball", "Enjoy a game of beach volleyball", 20.0, 20);
        Activity activity2 = new Activity("Snorkeling", "Explore underwater life", 30.0, 15);
        destination.addActivity(activity1);
        destination.addActivity(activity2);
        travelPackage.addDestination(destination);

        travelPackage.printItinerary();
        // Output can be verified manually
    }

    @Test
    void testPrintPassengerList() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation Package", 50);
        Passenger passenger1 = new StandardPassenger("John", 1, 100.0);
        Passenger passenger2 = new StandardPassenger("Alice", 2, 100.0);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        travelPackage.printPassengerList();
        // Output can be verified manually
    }

    @Test
    void testPrintAvailableActivities() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation Package", 50);
        Destination destination = new Destination("Beach Resort");
        Activity activity1 = new Activity("Beach Volleyball", "Enjoy a game of beach volleyball", 20.0, 20);
        destination.addActivity(activity1);
        travelPackage.addDestination(destination);

        travelPackage.printAvailableActivities();
        // Output can be verified manually
    }
}