package org.example;

import java.util.ArrayList;

/**
 * The Activity class represents an activity that can be booked by passengers at a destination which is a part of the
 * travel package.
 * Each activity has a name, description, cost, capacity, destination, and a list of passengers who have booked it.
 */

public class Activity {

    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

    /**
     * Constructs an Activity object with the specified parameters.
     *
     * @param name        The name of the activity.
     * @param description A brief description of the activity.
     * @param cost        The cost of participating in the activity.
     * @param capacity    The maximum number of passengers that can participate in the activity.
     */
    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    }


    /**
     * Returns the name of the activity.
     *
     * @return The name of the activity.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the activity.
     *
     * @param name The name of the activity.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a brief description of the activity.
     *
     * @return A brief description of the activity.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the activity.
     *
     * @param description A brief description of the activity.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the cost of participating in the activity.
     *
     * @return The cost of participating in the activity.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the cost of participating in the activity.
     *
     * @param cost The cost of participating in the activity.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Returns the maximum number of passengers that can participate in the activity.
     *
     * @return The maximum number of passengers that can participate in the activity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the maximum number of passengers that can participate in the activity.
     *
     * @param capacity The maximum number of passengers that can participate in the activity.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Returns the destination where the activity takes place.
     *
     * @return The destination where the activity takes place.
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the destination where the activity takes place.
     *
     * @param destination The destination where the activity takes place.
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }


    /**
     * Checks if there is space available for booking in the activity.
     *
     * @return {@code true} if there is space available, {@code false} otherwise.
     */
    public boolean hasSpace() {
        return capacity > 0;
    }

    /**
     * Books the activity for the specified passenger if there is space available and the passenger can book the activity.
     *
     * @param passenger The passenger who wants to book the activity.
     */
    public void bookActivity(Passenger passenger) {
        if (hasSpace()) {
            if (passenger.canBookActivity(this)) {
                passenger.bookActivity(this);
                capacity--;
            } else {
                System.out.println("Passenger cannot book this activity.");
            }
        } else {
            System.out.println("Activity is already full.");
        }
    }
}
