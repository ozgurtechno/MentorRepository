package polymorphism;

// This is DYNAMIC POLYMORPHISM, compiler will not understand any error in compile time...
public class SuperClass {

    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
class SubClass extends SuperClass
{
    //Super Class Method Overrided
    void methodOfSuperClass()
    {
        System.out.println("From Sub Class");
    }
}
