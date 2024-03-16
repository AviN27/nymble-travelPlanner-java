package org.example;

/**
 * The PremiumPassenger class represents a premium-level passenger who can book activities for free.
 * Each premium passenger has a name and passenger number.
 * They can book activities for free and are valued customers.
 */
public class PremiumPassenger extends Passenger {

    /**
     * Constructs a PremiumPassenger object with the specified name and passenger number.
     *
     * @param name           The name of the premium passenger.
     * @param passengerNumber The passenger number of the premium passenger.
     */
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    /**
     * Prints the details of the premium passenger, including name, passenger number,
     * passenger type, and the list of booked activities with the price "Free".
     */
    @Override
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Passenger Number: " + getPassengerNumber());
        System.out.println("Passenger Type: Premium");
        System.out.println("Booked Activities:");
        for (Activity activity : getBookedActivities()) {
            System.out.println("- Destination: " + activity.getDestination().getName());
            System.out.println("  Activity: " + activity.getName());
            System.out.println("  Price: Free"); // Premium passengers book activities for free
        }
    }

    /**
     * Checks if the premium passenger can book the specified activity.
     * Premium passengers can always book activities, so this method always returns true.
     *
     * @param activity The activity to check for booking.
     * @return {@code true} always.
     */
    @Override
    public boolean canBookActivity(Activity activity) {
        return true; // Premium passengers can always book activities
    }

    /**
     * Books the specified activity for the premium passenger.
     *
     * @param activity The activity to book.
     */
    @Override
    public void bookActivity(Activity activity) {
        this.addBookedActivity(activity);
    }
}
