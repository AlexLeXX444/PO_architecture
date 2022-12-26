package org.example.shapes;

import org.example.exceptions.IsExistException;

import java.util.ArrayList;
import java.util.List;

public class RectangleShape extends BaseShape{

    public RectangleShape(double sideA, double sideB) throws IsExistException {
        if (isExist(sideA, sideB)) {
            setShapeType("rectangle");
            List<Double> list = new ArrayList<>();
            list.add(sideA);
            list.add(sideB);
            setShapeSides(list);
        } else {
            throw new IsExistException();
        }
    }

    private boolean isExist(double a, double b) {
        return a > 0 && b > 0;
    }

    @Override
    public double solvePerimeter() {
        return shapeSides.get(0) * 2 + shapeSides.get(1) * 2;
    }

    @Override
    public double solveArea() {
        return shapeSides.get(0) * shapeSides.get(1);
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник со сторонами: [%.2f, %.2f]", shapeSides.get(0), shapeSides.get(1));
    }
}
