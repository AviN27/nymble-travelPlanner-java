package org.example;

/**
 * The StandardPassenger class represents a standard-level passenger who can book activities by paying the full cost.
 * Each standard passenger has a name, passenger number, and balance.
 */
public class StandardPassenger extends Passenger {

    private double balance;

    /**
     * Constructs a StandardPassenger object with the specified name, passenger number, and balance.
     *
     * @param name           The name of the standard passenger.
     * @param passengerNumber The passenger number of the standard passenger.
     * @param balance        The balance of the standard passenger.
     */
    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    /**
     * Returns the balance of the standard passenger.
     *
     * @return The balance of the standard passenger.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Prints the details of the standard passenger, including name, passenger number, balance,
     * and the list of booked activities with the price paid.
     */
    @Override
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Passenger Number: " + getPassengerNumber());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Booked Activities:");
        for (Activity activity : getBookedActivities()) {
            System.out.println("- Destination: " + activity.getDestination().getName());
            System.out.println("  Activity: " + activity.getName());
            System.out.println("  Price: $" + activity.getCost());
        }
    }

    /**
     * Checks if the standard passenger can book the specified activity.
     *
     * @param activity The activity to check for booking.
     * @return {@code true} if the standard passenger has sufficient balance to book the activity, {@code false} otherwise.
     */
    @Override
    public boolean canBookActivity(Activity activity) {
        return balance >= activity.getCost();
    }

    /**
     * Books the specified activity for the standard passenger.
     *
     * @param activity The activity to book.
     */
    @Override
    public void bookActivity(Activity activity) {
        if (canBookActivity(activity)) {
            balance -= activity.getCost();
            this.addBookedActivity(activity);
        }
    }
}
