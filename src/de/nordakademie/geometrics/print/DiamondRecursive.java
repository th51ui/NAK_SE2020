package de.nordakademie.geometrics.print;

import java.util.logging.Level;

public class DiamondRecursive {

    private int length;
    private boolean positive = true;

    public DiamondRecursive(int length) {
        this.length = length;
    }

    private void printMultiple(int number, String s){
        for (int i = 0; i < number; i++) {
            System.out.print(s);
        }
    }

    public void PrintDiamond(int actLength) {
        if (actLength < length && actLength >= 0 && positive == true) {
            printMultiple(length-actLength, " ");
            printMultiple(2*actLength+1, "*");
            System.out.println();
            PrintDiamond(actLength+1);
        } else if (actLength == length && positive == true) {
            printMultiple(length-actLength, " ");
            printMultiple(2*actLength+1, "*");
            System.out.println();
            positive = false;
            PrintDiamond(actLength-1);
        } else if (actLength < length && actLength >= 0 && positive == false) {
            printMultiple(length-actLength, " ");
            printMultiple(2*actLength+1, "*");
            System.out.println();
            PrintDiamond(actLength-1);
        }

    }

    public void setLength(int length){
        this.length = length;
    }
}
