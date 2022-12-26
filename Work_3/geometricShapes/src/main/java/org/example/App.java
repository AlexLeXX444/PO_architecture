package org.example;

import org.example.shapes.*;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws Exception {
        List<BaseShape> list = new ArrayList<>();
        list.add(new TriangleShape(2, 3, 4));
        list.add(new SquareShape(5));
        list.add(new RectangleShape(2, 3));
        list.add(new CircleShape(5));
        System.out.println(solveAllShapesPerimeter(list));
        System.out.println(solveAllShapesArea(list) + "\n");
        printList(list);
    }

    static String solveAllShapesPerimeter(List<BaseShape> list) {
        double result = 0.0;

        for (BaseShape baseShape : list) {
            result += baseShape.solvePerimeter();
        }
        return String.format("Периметр всех фигур равен  %.2f", result);
    }

    static String solveAllShapesArea(List<BaseShape> list) {
        double result = 0.0;

        for (BaseShape baseShape : list) {
            result += baseShape.solveArea();
        }

        return String.format("Площадь всех фигур равна  %.2f", result);
    }

    static void printList(List<BaseShape> list) {
        for (BaseShape shape : list) {
            System.out.println(shape);
        }
    }
}
