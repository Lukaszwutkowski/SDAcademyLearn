package OOPExercises.Geometric;

import OOPExercises.Geometric.Point2D3D.Movable;
import OOPExercises.Geometric.Point2D3D.MovablePoint;

public class Test {

    public static void main(String[] args) {
        Test1();

        Test2();

        Test3();

        Test4();


    }

    private static void Test4() {
        CircleGeometricObject circleGeometricObject = new CircleGeometricObject(14);
        System.out.println(circleGeometricObject.getArea());
        System.out.println(circleGeometricObject.getPerimeter());
        System.out.println(circleGeometricObject);
        Resizable resizable = new ResizableCircle(40);
        resizable.resize(30);
        System.out.println(resizable);
    }

    private static void Test3() {
        Movable movableCircle = new MovablePoint(20, 30, 4, 4);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }

    private static void Test2() {
        ShapEx4[] shapes = {
                new CirclEx4("blue", true, 20),
                new RectanglEx4("yellow", true, 20, 30),
                new SquarEx4("green", false, 40)};

        for (ShapEx4 shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }

    private static void Test1() {
        Shape shape = new Shape("red", false);
        System.out.println(shape);
        Shape circle = new Circle("blue", true, 20);
        System.out.println(circle);
        Shape rectangle = new Rectangle("yellow", true, 20, 30);
        System.out.println(rectangle);
        Shape square = new Square("green", false, 40);
        System.out.println(square);
    }
}
