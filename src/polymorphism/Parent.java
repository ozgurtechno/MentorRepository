package polymorphism;

// This is DYNAMIC POLYMORPHISM, compiler will not understand any error in compile time...
public class Parent {

    void methodOfSuperClass() {
        System.out.println("From Parent Class");
    }
}

class Child1 extends Parent {

    @Override
    void methodOfSuperClass() {
        System.out.println("From Child1 Class");
    }

    void child_1_Method(){
        System.out.println("This method belongs to Child Class");
    }
}

class Child2 extends Parent {


    @Override
    void methodOfSuperClass() {
        System.out.println("From Child2 Class");
    }

    void child_2_Method(){
        System.out.println("This method belongs to Child Class");
    }
}
