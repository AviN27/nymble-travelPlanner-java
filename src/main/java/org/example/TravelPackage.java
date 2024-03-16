package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The TravelPackage class represents a travel package offered by a travel agency.
 * Each travel package has a name, passenger capacity, destinations, and enrolled passengers.
 */
public class TravelPackage {

    private final String name;
    private final Integer passengerCapacity;
    private List<Destination> destinations;
    private final List<Passenger> passengers;

    /**
     * Constructs a TravelPackage object with the specified name and passenger capacity.
     *
     * @param name             The name of the travel package.
     * @param passengerCapacity The passenger capacity of the travel package.
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.passengers = new ArrayList<>();
        this.destinations = new ArrayList<>();
    }

    /**
     * Returns the name of the travel package.
     *
     * @return The name of the travel package.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the passenger capacity of the travel package.
     *
     * @return The passenger capacity of the travel package.
     */
    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Returns the list of destinations included in the travel package.
     *
     * @return The list of destinations included in the travel package.
     */
    public List<Destination> getDestinations() {
        return destinations;
    }

    /**
     * Sets the list of destinations included in the travel package.
     *
     * @param destinations The list of destinations to set.
     */
    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Returns the list of passengers enrolled in the travel package.
     *
     * @return The list of passengers enrolled in the travel package.
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }

    /**
     * Adds a passenger to the travel package if the passenger capacity is not exceeded.
     *
     * @param passenger The passenger to add.
     */
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Travel package is already full.");
        }
    }

    /**
     * Adds a destination to the travel package.
     *
     * @param destination The destination to add.
     */
    public void addDestination(Destination destination) {
        if (destinations == null) {
            destinations = new ArrayList<>();
        }
        destinations.add(destination);
    }

    /**
     * Prints the itinerary of the travel package, including destinations and activities.
     */
    public void printItinerary() {
        System.out.println("Travel Package Name: " + name);
        System.out.println("Itinerary:");
        for (Destination destination : destinations) {
            System.out.println("- Destination: " + destination.getName());
            System.out.println("  Activities:");
            for (Activity activity : destination.getActivities()) {
                System.out.println("    Name: " + activity.getName());
                System.out.println("    Cost: " + activity.getCost());
                System.out.println("    Capacity: " + activity.getCapacity());
                System.out.println("    Description: " + activity.getDescription());
            }
        }
    }

    /**
     * Prints the passenger list of the travel package, including passenger capacity and enrolled passengers.
     */
    public void printPassengerList() {
        System.out.println("Travel Package Name: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        System.out.println("Passenger List:");
        for (Passenger passenger : passengers) {
            System.out.println("- Name: " + passenger.getName());
            System.out.println("  Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    /**
     * Prints the details of available activities in the travel package.
     */
    public void printAvailableActivities() {
        System.out.println("Available Activities in " + name + ":");
        for (Destination destination : destinations) {
            System.out.println("- Destination: " + destination.getName());
            System.out.println("  Available Activities:");
            for (Activity activity : destination.getActivities()) {
                if (activity.hasSpace()) {
                    System.out.println("    Name: " + activity.getName());
                    System.out.println("    Spaces Available: " + activity.getCapacity());
                }
            }
        }
    }
}
