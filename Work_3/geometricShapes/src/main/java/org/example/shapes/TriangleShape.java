package org.example.shapes;

import org.example.exceptions.IsExistException;

import java.util.ArrayList;
import java.util.List;

public class TriangleShape extends BaseShape {

    public TriangleShape (double sideA, double sideB, double sideC) throws IsExistException {
        if (isExist(sideA, sideB, sideC)) {
            setShapeType("triangle");
            List<Double> list = new ArrayList<>();
            list.add(sideA);
            list.add(sideB);
            list.add(sideC);
            setShapeSides(list);
        } else {
            throw new IsExistException();
        }
    }

    private boolean isExist (double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < b + a;
    }

    @Override
    public double solvePerimeter () {
        double result = 0.0;
        for (Double shapeSide : shapeSides) {
            result += shapeSide;
        }
        return result;
    }

    @Override
    public double solveArea() {
        double prePerimeter = this.solvePerimeter() / 2;
        return Math.sqrt(prePerimeter * (prePerimeter - shapeSides.get(0)) * (prePerimeter - shapeSides.get(1)) * (prePerimeter - shapeSides.get(2)));
    }

    @Override
    public String toString() {
        return String.format("Треугольник со сторонами [%.2f, %.2f, %.2f]", shapeSides.get(0), shapeSides.get(1), shapeSides.get(2));
    }
}
