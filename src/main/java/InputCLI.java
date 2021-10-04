package main.java;

import java.util.Scanner;

public class InputCLI {
    public static void main(String[] args) {
        double d1=0.001, d2=0.001;
        Scanner newInput = new Scanner(System.in);
        System.out.println("enter two decimals: ");
        System.out.println("First decimal: ");
        d1= newInput.nextDouble();
        System.out.println("Second decimal:");
        d2 = newInput.nextDouble();
        System.out.println("Sum is: " + sumDouble(d1,d2));
        System.out.println("Substraction is: " + subDouble(d1,d2));

    }
    public static double sumDouble (double x, double y){
        return x+y;
    }
    public static double subDouble (double x, double y){
        return x-y;
    }
    public static double multiDouble (double x, double y){
        return x*y;
    }
}
