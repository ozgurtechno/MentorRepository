package abstraction.abstract_class;

public abstract class Shape {

    String color;

    public Shape(String color) {
        System.out.println(" Shape constructor called");
        this.color = color;
    }

    abstract int area();
    public abstract String toString();

    public String getColor() {
        return color;
    }
}
