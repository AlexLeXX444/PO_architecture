package Work_1.Program.modelElements;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
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
    public Color getColor() {
        return color;
    }
    public float getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "-== FASH ==-\n" + location + "\n" + angle + "\n" + color + "\n" + power;
    }
}
