package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

    @Test
    void testAddActivity() {
        Destination destination = new Destination("Beach Resort");

        Activity activity1 = new Activity("Beach Volleyball", "Enjoy a game of beach volleyball", 20.0, 20);
        Activity activity2 = new Activity("Snorkeling", "Explore underwater life", 30.0, 15);

        destination.addActivity(activity1);
        destination.addActivity(activity2);

        List<Activity> activities = destination.getActivities();

        // Check if the activities and destinations are linked
        assertEquals(2, activities.size());
        assertTrue(activities.contains(activity1));
        assertTrue(activities.contains(activity2));
    }

    @Test
    void testGetAvailableActivities() {
        Destination destination = new Destination("Beach Resort");

        Activity activity1 = new Activity("Beach Volleyball", "Enjoy a game of beach volleyball", 20.0, 20);
        Activity activity2 = new Activity("Snorkeling", "Explore underwater life", 30.0, 0); // No space available

        destination.addActivity(activity1);
        destination.addActivity(activity2);

        List<Activity> availableActivities = destination.getAvailableActivities();

        assertEquals(1, availableActivities.size());
        assertTrue(availableActivities.contains(activity1));
        assertFalse(availableActivities.contains(activity2));
    }
}