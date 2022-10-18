package inheritance.inheritance1;

public class Child2 {

    String name;
    Parent parent = new Parent();

    public void someMethod(){
        int x = parent.defaultField;
        int y = parent.protectedField;
        int z = parent.publicField;
//        int f = parent.privateField;
    }
}
