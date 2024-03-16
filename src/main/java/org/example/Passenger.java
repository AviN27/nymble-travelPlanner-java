package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The Passenger abstract class represents a passenger who can book activities in a travel package.
 * It is a super class for the Standard, Gold and Premium passengers.
 * Each passenger has a name, passenger number, and a list of booked activities.
 */
abstract class Passenger {

    private String name;
    private int passengerNumber;
    private List<Activity> bookedActivities;

    /**
     * Constructs a Passenger object with the specified name and passenger number.
     *
     * @param name           The name of the passenger.
     * @param passengerNumber The passenger number.
     */
    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
    }

    /**
     * Returns the name of the passenger.
     *
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the passenger.
     *
     * @param name The name of the passenger to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the passenger number.
     *
     * @return The passenger number.
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * Sets the passenger number.
     *
     * @param passengerNumber The passenger number to set.
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    /**
     * Abstract method to print the details of the passenger.
     */
    public abstract void printDetails();

    /**
     * Abstract method to check if the passenger can book the specified activity.
     *
     * @param activity The activity to check for booking.
     * @return {@code true} if the passenger can book the activity, {@code false} otherwise.
     */
    public abstract boolean canBookActivity(Activity activity);

    /**
     * Abstract method to book the specified activity for the passenger.
     *
     * @param activity The activity to book.
     */
    public abstract void bookActivity(Activity activity);

    /**
     * Adds a booked activity to the list of activities for the passenger.
     *
     * @param activity The activity to add to the booked activities list.
     */
    public void addBookedActivity(Activity activity) {
        if (bookedActivities == null) {
            bookedActivities = new ArrayList<>();
        }
        bookedActivities.add(activity);
    }

    /**
     * Returns the list of activities booked by the passenger.
     *
     * @return The list of activities booked by the passenger.
     */
    public List<Activity> getBookedActivities() {
        return bookedActivities;
    }
}
