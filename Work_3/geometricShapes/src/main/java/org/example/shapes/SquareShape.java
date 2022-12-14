package org.example.shapes;

import org.example.exceptions.IsExistException;

import java.util.ArrayList;
import java.util.List;

public class SquareShape extends BaseShape {

    public SquareShape(double sideA) throws IsExistException {
        if (isExist(sideA)) {
            setShapeType("square");
            List<Double> list = new ArrayList<>();
            list.add(sideA);
            setShapeSides(list);
        } else {
            throw new IsExistException();
        }
    }

    private boolean isExist (double a) {
        return a > 0;
    }

    @Override
    public double solvePerimeter() {
        return shapeSides.get(0) * 4;
    }

    @Override
    public double solveArea() {
        return Math.pow(shapeSides.get(0), 2);
    }

    @Override
    public String toString() {
        return String.format("Квадрат со сторонами [%.2f]", shapeSides.get(0));
    }
}
