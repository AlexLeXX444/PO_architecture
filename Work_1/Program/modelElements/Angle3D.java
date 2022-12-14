package Work_1.Program.modelElements;

public class Angle3D {
    private Point3D base, pointA, pointB, pointC;

    public Angle3D(Point3D base, Point3D pointA, Point3D pointB, Point3D pointC) {
        this.base = base;
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void Rotate(Point3D pointA, Point3D pointB, Point3D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point3D getBase() {
        return base;
    }
    public Point3D getPointA() {
        return pointA;
    }
    public Point3D getPointB() {
        return pointB;
    }
    public Point3D getPointC() {
        return pointC;
    }

    @Override
    public String toString() {
        return "Angle3D(" + base + ", " + pointA + ", " + pointB +  ", " + pointC + ")";
    }
}
