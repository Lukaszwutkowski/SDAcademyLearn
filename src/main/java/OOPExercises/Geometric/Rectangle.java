package OOPExercises.Geometric;

public class Rectangle extends Shape {

    double width;
    double lenght;


    public Rectangle(String color, boolean isFilled, double width, double lenght) {
        super(color, isFilled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public float getArea() {
        return (float) (width * lenght);
    }

    public float getPerimeter() {
        return (float) (2 * width + 2 * lenght);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and lenght=%f which is subclass off %s", width, lenght, super.toString());
    }
}
