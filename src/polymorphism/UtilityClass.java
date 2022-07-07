package polymorphism;

public class UtilityClass {
    static void util(Parent superclass) {
        superclass.methodOfSuperClass();
        //For each execution of this method, different objects will be passed to it.
        //which Object will be used is determined during run time only.
        //This shows dynamic polymorphism.
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();


        parent.methodOfSuperClass();
        child1.methodOfSuperClass();
        child2.methodOfSuperClass();

        System.out.println("----------------------------");

        util(parent);  //SuperClass object is passes to util()
        util(child1);     //SubClass object is passed to util()
        util(child2);    //SubClass2 object is passed to util()
    }
}
