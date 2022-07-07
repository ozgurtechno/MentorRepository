package inheritance;

public class Child extends Parent{

    public static void main(String[] args) {

        Parent parent = new Parent();

        System.out.println(parent.publicField);
        System.out.println(parent.defaultField);
        System.out.println(parent.protectedField);

    }

}
