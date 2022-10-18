package abstraction.abstract_class.sorular;

public class Cevap4 {

    public static void main(String[] args) {
        C c = new C();
        c.firstMethod();
        c.secondMethod();
        c.thirdMethod();
    }
}
abstract class A {
    abstract void firstMethod();
    void secondMethod(){
        System.out.println("SECOND");
        firstMethod();
    }
}
abstract class B extends A {
    @Override
    void firstMethod() {
        System.out.println("FIRST");
        thirdMethod();
    }
    abstract void thirdMethod();
}
class C extends B{
    @Override
    void thirdMethod() {
        System.out.println("THIRD");
    }
}

