package polymorphism;

// This is DYNAMIC POLYMORPHISM, compiler will not understand any error in compile time...
public class Parent {

    void methodOfSuperClass() {
        System.out.println("From Parent Class");
    }
}

class Child1 extends Parent {
    //Super Class Method Overrided
    void methodOfSuperClass() {
        System.out.println("From Child1 Class");
    }
}

class Child2 extends Parent {
    //Super Class Method Overrided
    void methodOfSuperClass() {
        System.out.println("From Child2 Class");
    }
}
