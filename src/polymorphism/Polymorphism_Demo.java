package polymorphism;

import java.util.Scanner;

public class Polymorphism_Demo {

    public static void main(String[] args) {


        // Without Polymorphism
        Parent parent = new Parent();
        Child1 cocuk1 = new Child1();
        Child2 cocuk2 = new Child2();

        Scanner scan = new Scanner(System.in);
        System.out.println(" Ebeveyn icin : 0 | Birinci Cocuk icin : 1 | Ikinci cocuk icin : 2 ye basiniz? ");
        int secim = scan.nextInt();

        switch (secim){
            case 0 : parent.methodOfSuperClass(); break;
            case 1 : cocuk1.child_1_Method(); break;
            case 2 : cocuk2.child_2_Method(); break;
        }


        // With Polymorphism
        Parent a = getSecim(secim);
        a.methodOfSuperClass();

    }

    static Parent getSecim(int n){
        return n == 0 ? new Parent() : n == 1 ? new Child1() : new Child2();
    }

}
