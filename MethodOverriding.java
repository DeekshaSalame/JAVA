
class Animal {
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    
    
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    
    
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); 

        
        Dog myDog = new Dog();
        myDog.makeSound(); 

        
        Cat myCat = new Cat();
        myCat.makeSound(); 

        // Upcasting
        Animal myPet;
        myPet = myDog;
        myPet.makeSound(); 

        myPet = myCat;
        myPet.makeSound(); 
    }
}

    

