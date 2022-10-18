package polymorphism;

// This is STATIC polymorphism -> it happens in complie time and Java warn us....

public class AnyClassName {

    private String name;

    public double calculate(int a, double b){
        return a*b;
    }

    private double calculate(double a, int b){
        return a*b;
    }

    public int calculate(int a, int b){
        return a*b;
    }





}

