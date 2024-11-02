import java.util.Scanner;
// This program will Take Input of Base & Height Then give you area of Triangle
public class AreaTriangle
{
    public static void main(String arg[])
    {
        float base,height,area;
        // It is a float variable that contains 3 values
        // D type float bcz if area becomes in decimal value
        System.out.println("Enter Value of Base & Height --> ");
        // It Give Output of Give Input
        Scanner v=new Scanner(System.in);
        // It will Take Input from Keyboard as V
        base = v.nextFloat();
        // It will take value from V
        height = v.nextFloat();
        // It will take second value comes in V
        // We can create as many Input we need to use v.next() function for this
        area = base * height / 2;
        // It will store Calculated Area of triangle
        System.out.println("Area of Triangle --> " + area );
        // It will simply Print msg with Answer (Area)
    }
}
