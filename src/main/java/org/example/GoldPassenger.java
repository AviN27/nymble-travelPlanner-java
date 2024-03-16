package org.example;


/**
 * The GoldPassenger class represents a gold-level passenger who can book activities with a discount.
 * Each gold passenger has a name, passenger number, and balance.
 * They can book activities with a 10% discount on the cost.
 */
public class GoldPassenger extends Passenger {

    /** The balance of the gold passenger. */
    private double balance;

    /**
     * Constructs a GoldPassenger object with the specified name, passenger number, and balance.
     *
     * @param name           The name of the gold passenger.
     * @param passengerNumber The passenger number of the gold passenger.
     * @param balance        The balance of the gold passenger.
     */
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    /**
     * Returns the balance of the gold passenger.
     *
     * @return The balance of the gold passenger.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Prints the details of the gold passenger, including name, passenger number, balance,
     * and the list of booked activities with the discounted price.
     */
    @Override
    public void printDetails() {
        System.out.println("--- Gold Passenger ---");
        System.out.println("Name: " + getName());
        System.out.println("Passenger Number: " + getPassengerNumber());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Booked Activities:");
        for (Activity activity : getBookedActivities()) {
            System.out.println("- Destination: " + activity.getDestination().getName());
            System.out.println("  Activity: " + activity.getName());
            System.out.println("  Price: $" + (activity.getCost() * 0.9)); // Apply discount
        }
        System.out.println("---------------------------------");
    }

    /**
     * Checks if the gold passenger can book the specified activity with the discounted price.
     *
     * @param activity The activity to check for booking.
     * @return {@code true} if the gold passenger can book the activity, {@code false} otherwise.
     */
    @Override
    public boolean canBookActivity(Activity activity) {
        return balance >= (activity.getCost() * 0.9);
    }

    /**
     * Books the specified activity for the gold passenger with the discounted price.
     *
     * @param activity The activity to book.
     */
    @Override
    public void bookActivity(Activity activity) {
        if (canBookActivity(activity)) {
            balance -= (activity.getCost() * 0.9);
            this.addBookedActivity(activity);
        }
    }
}
