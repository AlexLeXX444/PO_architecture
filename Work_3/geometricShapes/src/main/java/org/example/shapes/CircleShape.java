package org.example.shapes;

import org.example.exceptions.IsExistException;

import java.util.ArrayList;
import java.util.List;

public class CircleShape extends BaseShape{

    public CircleShape(double radius) throws IsExistException {
        if (isExist(radius)) {
            setShapeType("circle");
            List<Double> list = new ArrayList<>();
            list.add(radius);
            setShapeSides(list);
        } else {
            throw new IsExistException();
        }
    }

    private boolean isExist(double a) {
        return a > 0;
    }

    @Override
    public double solvePerimeter() {
        return 2 * Math.PI * shapeSides.get(0);
    }

    @Override
    public double solveArea() {
        return Math.PI * Math.pow(shapeSides.get(0), 2);
    }

    @Override
    public String toString() {
        return String.format("Окружность с радиусом: [%.2f]", shapeSides.get(0));
    }
}