import java.util.Scanner;

// General class
abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

// Derived class for Box
class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

// Derived class for Cube
class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

// Derived class for Cylinder
class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class for Cone
class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

// Main class to test the derived classes
public class ThreeDObjectDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Box
        System.out.print("Enter length, width, and height of the box: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cube
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Cylinder
        System.out.print("Enter the radius and height of the cylinder: ");
        double radius = scanner.nextDouble();
        double cylHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, cylHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone
        System.out.print("Enter the radius and height of the cone: ");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}

    

