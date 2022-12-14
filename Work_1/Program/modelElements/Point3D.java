package Work_1.Program.modelElements;

public class Point3D {
    private int cordX, cordY, cordZ;
    private String color;

    public Point3D(String color, int x, int y, int z) {
        this.color = color;
        this.cordX = x;
        this.cordY = y;
        this.cordZ = z;
    }

    public Point3D() {
        this("white", 0, 0, 0);
    }

    public Point3D(int x, int y, int z) {
        this("", x, y, z);
    }

    public void Move(int x, int y, int z) {
        this.cordX = x;
        this.cordY = y;
        this.cordZ = z;
    }

    public int getCordX() {
        return cordX;
    }
    public int getCordY() {
        return cordY;
    }
    public int getCordZ() {
        return cordZ;
    }

    @Override
    public String toString() {
        if (color.length() == 0) {
            return "Point3D(" + cordX + ", " + cordY + ", " + cordZ + ")";
        } else {
            return "Point3D " + color + " (" + cordX + ", " + cordY + ", " + cordZ + ")";
        }
    }
}
