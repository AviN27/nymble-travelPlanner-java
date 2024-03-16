package org.example;

public class Main {

    /**
     * This class contains sample data for the Travel Planner.
     * It includes creation of a Travel Package, addition of destinations, and activities to those destinations.
     * It also includes the creation of all types of passengers. These passengers are added to the travel package and the desired activities are booked.
     * The itinerary, passenger list, details about each passenger and the available activities are displayed.
     */
    public static void main(String[] args) {

        // Create a travel package
        TravelPackage travelPackage = new TravelPackage("Summer Vacation Package", 50);


        // Create destinations
        Destination destination1 = new Destination("Beach Resort");
        Destination destination2 = new Destination("Mountain Homestay");

        // Create activities for destination1
        Activity activity1 = new Activity("Beach Volleyball", "Enjoy a game of beach volleyball", 20.0, 20);
        Activity activity2 = new Activity("Snorkeling", "Explore underwater life", 30.0, 15);

        // Add activities to destination1
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);

        // Create activities for destination2
        Activity activity3 = new Activity("Hiking", "Enjoy a hike in the mountains", 15.0, 25);
        Activity activity4 = new Activity("Bonfire", "Gather around for a bonfire night", 10.0, 30);

        // Add activities to destination2
        destination2.addActivity(activity3);
        destination2.addActivity(activity4);

        // Add destinations to the travel package
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Create passengers
        StandardPassenger standardPassenger1 = new StandardPassenger("Joseph", 1, 100.0);
        GoldPassenger goldPassenger1 = new GoldPassenger("Aishwariya", 2, 200.0);
        PremiumPassenger premiumPassenger1 = new PremiumPassenger("Tanya", 3);
        StandardPassenger standardPassenger2 = new StandardPassenger("Avinash", 4, 150.0);
        GoldPassenger goldPassenger2 = new GoldPassenger("Owais", 5, 250.0);
        PremiumPassenger premiumPassenger2 = new PremiumPassenger("Emma", 6);

        // Add passengers to the travel package
        travelPackage.addPassenger(standardPassenger1);
        travelPackage.addPassenger(goldPassenger1);
        travelPackage.addPassenger(premiumPassenger1);
        travelPackage.addPassenger(standardPassenger2);
        travelPackage.addPassenger(goldPassenger2);
        travelPackage.addPassenger(premiumPassenger2);

        // Book activities for passengers
        activity1.bookActivity(standardPassenger1);
        activity2.bookActivity(goldPassenger1);
        activity3.bookActivity(premiumPassenger1);
        activity1.bookActivity(standardPassenger2);
        activity2.bookActivity(goldPassenger2);
        activity3.bookActivity(premiumPassenger2);

        // Print itinerary of the travel package
        travelPackage.printItinerary();

        // Print passenger list of the travel package
        travelPackage.printPassengerList();

        // Print details of individual passengers
        standardPassenger1.printDetails();
        goldPassenger1.printDetails();
        premiumPassenger1.printDetails();
        standardPassenger2.printDetails();
        goldPassenger2.printDetails();
        premiumPassenger2.printDetails();

        // Print details of available activities
        travelPackage.printAvailableActivities();
    }
}