package org.example;

import org.example.exceptions.IsExistException;
import org.example.shapes.BaseShape;
import org.example.shapes.TriangleShape;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IsExistException {
        List<BaseShape> list = new ArrayList<>();
        list.add(new TriangleShape(2, 3, 4));
        System.out.println(list.get(0).solveArea());
    }
}
