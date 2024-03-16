package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The Destination class represents a destination where various activities can be performed.
 * Each destination has a name and a list of activities available at that destination.
 */
public class Destination {

    private String name;

    private List<Activity> activities;

    /**
     * Constructs a Destination object with the specified name.
     *
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Returns the name of the destination.
     *
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the list of activities available at the destination.
     *
     * @return The list of activities.
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Adds an activity to the list of activities available at the destination.
     *
     * @param activity The activity to add.
     */
    public void addActivity(Activity activity) {
        activity.setDestination(this);
        activities.add(activity);
    }

    /**
     * Returns a list of activities that still have spaces available for booking.
     *
     * @return List of activities.
     */
    public List<Activity> getAvailableActivities() {
        List<Activity> availableActivities = new ArrayList<>();
        for (Activity activity : activities) {
            if (activity.hasSpace()) {
                availableActivities.add(activity);
            }
        }
        return availableActivities;
    }
}
