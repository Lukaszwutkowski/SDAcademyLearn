package OOPExercises.Geometric;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLenght(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setWidth(width);
        super.setLenght(lenght);
    }

    @Override
    public String toString() {
        return String.format("Square with width=%f and lenght=%f which is subclass off %s", width, lenght, super.toString());
    }
}
