package de.nordakademie.geometrics.print;

public class Diamond {

    private int length;

    public Diamond(int length){
        this.length = length;
    }

    public void printDiamond(){
        for (int i = 0; i <= length; i++) {
            printMultiple(length-i, " ");
            printMultiple(2*i+1, "*");
            System.out.println();
        }
        for (int i = length-1; i >= 0; i--) {
            printMultiple(length-i, " ");
            printMultiple(2*i+1, "*");
            System.out.println();
        }
    }

    private void printMultiple(int number, String s){
        for (int i = 0; i < number; i++) {
            System.out.print(s);
        }
    }

    public void setLength(int length){
        this.length = length;
    }
}
