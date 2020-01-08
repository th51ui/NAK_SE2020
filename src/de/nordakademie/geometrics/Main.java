package de.nordakademie.geometrics;


import de.nordakademie.geometrics.calculate.Circle;
import de.nordakademie.geometrics.calculate.Rectangle;
import de.nordakademie.geometrics.print.Diamond;
import de.nordakademie.geometrics.print.DiamondRecursive;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        execCalculateForms(5,4,7);
        execDiamondPrint(10);
        execDiamondRecursivePrint(10);
    }

    public static void execCalculateForms(int circleDiameter, int rectangleHeight, int rectangleLength){
        Circle test = new Circle(circleDiameter);
        Rectangle test2 = new Rectangle(rectangleHeight,rectangleLength);
        System.out.println(test.calculateArea());
        System.out.println(test2.calculateArea());
    }

    public static void execDiamondPrint(int length){
        Diamond diamond = new Diamond(length);
        diamond.printDiamond();
    }

    public static void execDiamondRecursivePrint(int length){
        DiamondRecursive diamond = new DiamondRecursive(length);
        diamond.PrintDiamond(0);
    }
}
