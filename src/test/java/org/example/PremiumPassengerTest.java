package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumPassengerTest {

    @Test
    void testCanBookActivity() {
        PremiumPassenger premiumPassenger = new PremiumPassenger("John", 1);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        assertTrue(premiumPassenger.canBookActivity(activity));
    }

    @Test
    void testBookActivity() {
        PremiumPassenger premiumPassenger = new PremiumPassenger("John", 1);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 20);

        premiumPassenger.bookActivity(activity);

        assertEquals(1, premiumPassenger.getBookedActivities().size());
    }
}