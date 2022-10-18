package inheritance.inheritance3;

public class Car {

    // ------------------------------------------ Fields  ------------------------------------------------------
    private String model;
    private int year;
    public static int totalCarAmount;

    // -------------------------------------- Constructors  ----------------------------------------------------

    public Car(String model, int year) {  // Constructor
        this.model = model;
        this.year = year;
        //addNewCar();
    }

    // --------------------------------------  Methods  --------------------------------------------------------
    public void startEngine() {
        System.out.println("Engine started");
    }

    public static void addNewCar(){
        totalCarAmount++;
    }


    // --------------------------------------Getters and Setters------------------------------------------------
    public String getModel() {  // Getter
        return model;
    }

    public void setModel(String model) {  // Setter

        this.model = model;
    }

    public int getYear() {  // Getter
        return year;
    }

    public void setYear(int year) {   // Setter
        this.year = year;
    }
}
