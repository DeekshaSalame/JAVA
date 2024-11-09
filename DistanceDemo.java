// Base class
class Distance {
    protected double distanceInMiles;

    // Constructor
    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    // Method to calculate travel time in hours assuming speed is 60 miles per hour
    public void travelTime() {
        double speedInMilesPerHour = 60.0;
        double time = distanceInMiles / speedInMilesPerHour;
        System.out.println("Travel time (in hours) at 60 miles per hour: " + time);
    }
}

// Derived class
class DistanceMKS extends Distance {

    // Constructor
    public DistanceMKS(double distanceInKilometers) {
        super(distanceInKilometers / 1.60934); // Convert km to miles for base class constructor
    }

    // Overriding method to calculate travel time in seconds assuming speed is 100 km per second
    @Override
    public void travelTime() {
        double speedInKmPerSecond = 100.0;
        double time = (distanceInMiles * 1.60934) / speedInKmPerSecond; // Convert miles to km
        System.out.println("Travel time (in seconds) at 100 km per second: " + time);
    }
}

// Main class to demonstrate the working of the classes
public class DistanceDemo {
    public static void main(String[] args) {
        // Create an object of the base class
        Distance distance = new Distance(300); // 300 miles
        System.out.println("Base class method:");
        distance.travelTime();

        // Create an object of the derived class
        DistanceMKS distanceMKS = new DistanceMKS(482.803); // 482.803 kilometers (equivalent to 300 miles)
        System.out.println("\nDerived class method:");
        distanceMKS.travelTime();
    }
}

    

