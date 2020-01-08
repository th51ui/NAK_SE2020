package de.nordakademie;

import java.lang.Math.*;

public class Circle {

    private int diameter;

    public Circle (int diameter) {
        this.diameter = diameter;
    }

    public double calculateArea() {
        return (Math.PI * Math.pow((diameter/2), 2));
    }
}
