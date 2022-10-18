package inheritance.inheritance3;

public class RacingCar extends Car{

    // ------------------------------------------ Fields  ------------------------------------------------------
    int maxSpeed;


    // -------------------------------------- Constructors  ----------------------------------------------------

    public RacingCar(String model, int year, int maxSpeed) {
        super(model, year);
        this.maxSpeed = maxSpeed;
    }

    // --------------------------------------  Methods  --------------------------------------------------------


    // --------------------------------------Getters and Setters------------------------------------------------


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
