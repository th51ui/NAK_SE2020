package de.nordakademie.lesson1;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        Circle test = new Circle(5);
        Rectangle test2 = new Rectangle(4,2);
        System.out.println(test.calculateArea());
        System.out.println(test2.calculateArea());
    }
}
