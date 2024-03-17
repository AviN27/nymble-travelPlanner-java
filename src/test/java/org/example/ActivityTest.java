package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    @Test
    void testHasSpace() {
        Activity activityWithSpace = new Activity("Test Activity", "Test Description", 50.0, 10);
        assertTrue(activityWithSpace.hasSpace());

        Activity activityWithoutSpace = new Activity("Test Activity", "Test Description", 50.0, 0);
        assertFalse(activityWithoutSpace.hasSpace());
    }

    @Test
    void testBookActivity() {
        // Create a passenger
        StandardPassenger passenger = new StandardPassenger("John", 1, 100.0);

        // Create an activity with space
        Activity activityWithSpace = new Activity("Test Activity", "Test Description", 50.0, 1);

        // Book activity for the passenger
        activityWithSpace.bookActivity(passenger);

        // Check if activity was booked successfully
        assertEquals(1, passenger.getBookedActivities().size());
    }

    @Test
    void testBookActivityWithoutSpace() {

        // Create an activity without space
        Activity activityWithoutSpace = new Activity("Test Activity", "Test Description", 50.0, 0);

        // Try to book activity for the passenger
        StandardPassenger passenger = new StandardPassenger("Alice", 2, 100.0);
        activityWithoutSpace.bookActivity(passenger);

        // Check if activity booking failed due to lack of space
        assertNull(passenger.getBookedActivities(), "Activity is already full.");

    }
}