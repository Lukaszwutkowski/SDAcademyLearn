package OOPExercises.Geometric.Point2D3D;

public class Test {

    public static void main(String[] args) {


        Test1();

        Test2();

        Test3();


    }

    private static void Test3() {
        Movable movablePoint = new MovablePoint(10, 10, 3, 3);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);
    }

    private static void Test2() {
        Line line = new Line(10, 20, 30, 40);
        System.out.println(line.getLength());
        System.out.println(line.getMiddlePoint());
    }

    private static void Test1() {
        Point2D point2D = new Point2D(10, 20);
        point2D.setXY(43, 65);
        System.out.println(point2D);
        Point3D point3D = new Point3D(10, 20, 30);
        point3D.setXYZ(43, 64, 2);
        System.out.println(point3D);
    }
}
