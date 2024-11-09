class Person {
    String name;
    int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name; // 'this' refers to the instance variable
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + this.name);  // 'this' is optional here, but it makes the code clearer
        System.out.println("Age: " + this.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Person p = new Person("John", 25);
        p.displayDetails();
    }
}

