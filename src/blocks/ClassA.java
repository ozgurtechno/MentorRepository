package blocks;

public class ClassA {

    static {
        System.out.println("ClassA Static Blok Cagrildi...");
    }

    {
        System.out.println("ClassA Instance Blok cagrildi...");
    }

    public ClassA() {
        System.out.println("ClassA Constructor cagrildi...");
    }
}
