// Base class
class Parent {
    // Static method in the superclass
    public static void display() {
        System.out.println("Static method in Parent class");
    }

    // Non-static method in the superclass
    public void show() {
        System.out.println("Non-static method in Parent class");
    }
}

// Derived class
class Child extends Parent {
    // Static method in the subclass
    public static void display() {
        System.out.println("Static method in Child class");
    }

    // Non-static method in the subclass
    @Override
    public void show() {
        System.out.println("Non-static method in Child class");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        // Reference of Parent class, object of Child class
        Parent obj = new Child();

        // Method hiding: Calls the static method of the Parent class
        Parent.display();
        Child.display();

        // Method overriding: Calls the overridden method in the Child class
        obj.show();
    }
}

    

