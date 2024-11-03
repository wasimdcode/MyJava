import java.util.Scanner;
// This program will find Area & Volume of Cuboid
public class AreaofCuboid
{
    public static void main(String arg[])
    {
        float l,b,h;
        // For finding area of each sides we need Length, Breadth & Height
        float area,volume;
        // These for Calculating Area & Volume
        float fb,rl,bt;
        // Front/back , Right/Left, Bottom/Top
        // These will have area of every sides
        System.out.println("Hey User ! for finding the area of Cuboid ");
        System.out.println("Enter values of Length, Breadth, Height ");
        // These will print msg for Entering Values
        Scanner v=new Scanner(System.in);
        l = v.nextFloat();
        b = v.nextFloat();
        h = v.nextFloat();
        // It will store input values in Variables that we need
        fb = l * h;
        // This is the formula for calculating area of Front/Back
        rl = b * h;
        // This is the formula for calculating area of Right/Left
        bt = l * b;
        // This is the formula for calculating area of Bottom/Top
        area = 2 * (fb + rl + bt);
        // This is the formula for Calculating Total Surface Area of Cuboid
        volume = l * b * h;
        // This is for Calculating Volume of Cuboid
        System.out.println("The area of Cuboid is " + area);
        System.out.println("The volume of Cuboid is " + volume);
        // It will print out Area & Volume of Cuboid with MSG
    }
}
