package abstraction.abstract_class;

public abstract class Shape {

    String color;
    static int shapeCount;

    public Shape(String color) {
        System.out.println(" Shape constructor called");
        this.color = color;
        shapeCount++;
    }

    abstract int area();

    public String getColor() {
        return color;
    }
}
