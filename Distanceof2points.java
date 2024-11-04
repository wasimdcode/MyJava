// This is the program for calculating Distance between 2 points
import java.util.Scanner;

class Distanceof2points
{
    public static void main(String arg[])
    {
        // These are the variable will store Values we need
        double x1,x2,y1,y2;

        // This Variable will store Formula
        double distance;
        System.out.println("Enter Coordinates of two points ");
        System.out.println("-------------------------------");
        Scanner c=new Scanner(System.in);

        // These will take all the input and store them into exact variables
        System.out.print("Enter x1 -> ");
        x1 = c.nextDouble();
        System.out.print("Enter x2 -> ");
        x2 = c.nextDouble();
        System.out.print("Enter y1 -> ");
        y1 = c.nextDouble();
        System.out.print("Enter y2 -> ");
        y2 = c.nextDouble();

        /* This is the formula for Calculating Distance for creating this
        Formula i have used a method for calculating power
        Math.pow is a built-in Java method that calculates a number raised
        to a power. It takes two parameters:
        Base (the number being raised)
        Exponent (the power to raise it to)
        The syntax is: Math.pow(base, exponent)
        For example:
        Math.pow(2, 3)    // means 2³ = 2 * 2 * 2 = 8
         */
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("The Distance is " + distance);
    }
}