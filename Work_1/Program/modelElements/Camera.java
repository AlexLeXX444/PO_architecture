package Work_1.Program.modelElements;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void RotateAngle(Angle3D angle) {
        this.angle.Rotate(angle.getPointA(), angle.getPointB(), angle.getPointC());
    }

    public void MovePoint(Point3D point) {
        this.location.Move(point.getCordX(), point.getCordY(), point.getCordZ());
    }

    public Point3D getLocation() {
        return location;
    }
    public Angle3D getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "-== CAMERA ==-\n" + location + "\n" + angle;
    }
}
