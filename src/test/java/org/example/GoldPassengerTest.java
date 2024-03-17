package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldPassengerTest {

    @Test
    void testCanBookActivityWithSufficientBalance() {
        GoldPassenger goldPassenger = new GoldPassenger("John", 1, 100.0);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        assertTrue(goldPassenger.canBookActivity(activity));
    }

    @Test
    void testCanBookActivityWithInsufficientBalance() {
        GoldPassenger goldPassenger = new GoldPassenger("John", 1, 40.0); // Not enough balance
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        assertFalse(goldPassenger.canBookActivity(activity));
    }

    @Test
    void testBookActivity() {
        GoldPassenger goldPassenger = new GoldPassenger("John", 1, 100.0);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        goldPassenger.bookActivity(activity);

        // Check if activity was booked successfully
        assertEquals(1, goldPassenger.getBookedActivities().size());

        // Check if the balance is correct as per discounted price
        assertEquals(55.0, goldPassenger.getBalance()); // 100 - (50 * 0.9)
    }
}