/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */



import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int One = 350;

        System.out.println("What is the length of the ceiling in feet:");
        Scanner userInput = new Scanner(System.in);
        String ceiling = userInput.nextLine();
        double ceilingA = Double.parseDouble(ceiling);

        System.out.println("What is the width of the ceiling in feet:");
        String width = userInput.nextLine();
        double widthA = Double.parseDouble(width);

        double Area = ceilingA * widthA;
        double gallon = Area/One;
        double gallonA = Math.ceil(gallon);

        System.out.println("You will need to purchase "+ gallonA + " gallons of paint to cover " + Area +" square feet.");
    }
}
