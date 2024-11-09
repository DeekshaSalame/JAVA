
class Animal {
    
    public void eat() {
        System.out.println("Animal eats");
    }
}


class Mammal extends Animal {
    
    public void walk() {
        System.out.println("Mammal walks");
    }
}


class Dog extends Mammal {

    public void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to demonstrate multilevel inheritance
public class Multilevel {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.eat();  
        dog.walk(); 
        dog.bark(); 
    }
}

    

