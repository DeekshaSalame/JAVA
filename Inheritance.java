// Base class
class Animal {
    // Instance variables
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to display the name
    public void display() {
        System.out.println("I am an animal named " + name);
    }
}

// Derived class
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the constructor of the base class
    }

    // Method specific to Dog
    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        // Create an object of the base class
        Animal animal = new Animal("Generic Animal");
        animal.display();

        // Create an object of the derived class
        Dog dog = new Dog("Buddy");
        dog.display();
        dog.bark();
    }
}

    

