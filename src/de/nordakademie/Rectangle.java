package de.nordakademie;

public class Rectangle {

    private int sidea;
    private int sideb;

    public Rectangle (int sidea, int sideb) {
        this.sidea = sidea;
        this.sideb = sideb;
    }

    public int calculateArea() {
        return (sidea * sideb);
    }
}
