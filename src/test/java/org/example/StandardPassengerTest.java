package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardPassengerTest {

    @Test
    void testCanBookActivityWithSufficientBalance() {
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        assertTrue(standardPassenger.canBookActivity(activity));
    }

    @Test
    void testCanBookActivityWithInsufficientBalance() {
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 40.0); // Not enough balance
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        assertFalse(standardPassenger.canBookActivity(activity));
    }

    @Test
    void testBookActivity() {
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        standardPassenger.bookActivity(activity);

        assertEquals(1, standardPassenger.getBookedActivities().size());
        assertEquals(50.0, standardPassenger.getBalance()); // 100 - 50
    }
}