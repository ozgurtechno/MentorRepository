package abstraction.abstract_class;

public class Rectangle extends Shape{

    private int heigth;
    private int width;

    public Rectangle(int heigth, int width, String color) {
        super(color);
        System.out.println("Inside Rectangle Constructor");
        this.heigth = heigth;
        this.width = width;
    }

    @Override
    int area() {
        return heigth * width ;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor() + " and rectangle area is "+ area();
    }
}
