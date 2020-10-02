package OOPExercises.Geometric;

public class CirclEx4 extends ShapEx4 {

    private float radius;

    public CirclEx4(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is subclass off %s", radius, super.toString());
    }
}
