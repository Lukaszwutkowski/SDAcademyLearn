package OOPExercises.Geometric;

abstract class ShapEx4 {

    private String color;
    private boolean isFilled;


    public ShapEx4(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public ShapEx4() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract float getArea();

    public abstract float getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s",
                color, isFilled ? "filled" : "NotFilled");
    }

}
