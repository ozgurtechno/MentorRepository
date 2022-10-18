package abstraction.abstract_class.sorular;

public class Cevap1 {

    public static void main(String[] args) {
        X1 x = new Y1();
        x.abstractMethod();
    }

}
abstract class X1 {
    public X1() {
        System.out.println("ONE");
    }

    abstract void abstractMethod();
}

class Y1 extends X1 {

    public Y1() {
        System.out.println("TWO");
    }

    @Override
    void abstractMethod() {
        System.out.println("THREE");
    }

}

