package org.example.shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseShape {
    protected String shapeType;
    protected List<Double> shapeSides = new ArrayList<>();

    protected void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    protected void setShapeSides(List<Double> shapeSides) {
        this.shapeSides = shapeSides;
    }

    public abstract double solvePerimeter();

    public abstract double solveArea();

    @Override
    public abstract String toString();
}
