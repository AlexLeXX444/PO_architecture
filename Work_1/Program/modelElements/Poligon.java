package Work_1.Program.modelElements;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    private List<Point3D> points = new ArrayList<>();

    public Poligon(List<Point3D> points) {
        this.points = points;
    }

    public Poligon() {
        this.points.add(new Point3D());
    }

    public List<Point3D> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return points.toString();
    }
}
