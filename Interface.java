// Interface 1
interface Interface1 {
    void method1();
    void method2();
}

// Interface 2
interface Interface2 {
    void method3();
    void method4();
}

// Interface 3
interface Interface3 {
    void method5();
    void method6();
}

// Inherited Interface that extends the above 3 interfaces
interface NewInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

// Concrete class to be inherited
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

// Class implementing the new interface and inheriting the concrete class
class MyClass extends ConcreteClass implements NewInterface {
    public void method1() {
        System.out.println("Method 1 from Interface 1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface 1");
    }

    public void method3() {
        System.out.println("Method 3 from Interface 2");
    }

    public void method4() {
        System.out.println("Method 4 from Interface 2");
    }

    public void method5() {
        System.out.println("Method 5 from Interface 3");
    }

    public void method6() {
        System.out.println("Method 6 from Interface 3");
    }

    public void method7() {
        System.out.println("Method 7 from NewInterface");
    }
}

// Methods that take interfaces as arguments
class InterfaceTest {
    public static void testInterface1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    public static void testInterface2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }

    public static void testInterface3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }

    public static void testNewInterface(NewInterface obj) {
        obj.method7();
    }
    
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        testInterface1(myObject);
        testInterface2(myObject);
        testInterface3(myObject);
        testNewInterface(myObject);
        myObject.concreteMethod();
    }
}


