package inheritance.inheritance3;

public class Inheritance_Demo {

    public static void main(String[] args) {


        Car honda = new Car("Honda", 2020);
        Car.addNewCar();

        Car suv = new SUV("Peugeout3008", 2022, 4);
        SUV.addNewCar();

        Car ferrari = new RacingCar("Ferrari", 2008, 380);
        RacingCar.addNewCar();

        honda.startEngine();
        suv.startEngine();
        ferrari.startEngine();


        int x = Car.totalCarAmount;
        int y = SUV.totalCarAmount;
        int z = RacingCar.totalCarAmount;

        System.out.print(x + " " + y + " " + z);

    }
}

    // DRY - Dont Repeat Yourself
