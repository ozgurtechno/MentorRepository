package inheritance.inheritance1;

public class Child extends Parent{

    String name;

    public void someMethod(){
        System.out.println(this.publicField);
        System.out.println(this.defaultField);
        System.out.println(this.protectedField);
//        System.out.println(this.privateField);
    }

}
