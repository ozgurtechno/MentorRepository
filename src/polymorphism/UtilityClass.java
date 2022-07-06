package polymorphism;

public class UtilityClass {
    static void util(SuperClass superclass)
    {
        superclass.methodOfSuperClass();
        //For each execution of this method, different objects will be passed to it.
        //which Object will be used is determined during run time only.
        //This shows dynamic polymorphism.
    }

    public static void main(String[] args)
    {
        SuperClass superclass1 = new SuperClass();
        SubClass subclass = new SubClass();
        SuperClass superclass2 = new SubClass();

        util(superclass1);  //SuperClass object is passes to util()
        util(subclass);     //SubClass object is passed to util()
        util(superclass2); //SubClass object is passed to util()
    }
}
