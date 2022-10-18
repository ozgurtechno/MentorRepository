package abstraction.interfaces;

public class Circle implements Shape{

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public int area() {
        return 2 * 3 * radius;
    }

    @Override
    public int perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


}
