package org.example.exceptions;

public class IsExistException extends Exception {

    public IsExistException () {
        System.out.println("По заданным сторонам фигура существовать не может!");
    }
}
