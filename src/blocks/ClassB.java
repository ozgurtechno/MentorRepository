package blocks;

public class ClassB extends ClassA{

    static {
        System.out.println("ClassB static blok cagrildi");
    }

    {
        System.out.println("ClassB instance Blok Cagrildi");
    }

    public ClassB() {
        System.out.println("ClassB constructor cagrildi...");
    }
}
