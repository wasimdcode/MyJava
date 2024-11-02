import java.util.Scanner;
// This is the second method of Finding the Area of Triangle
public class AreaTriangle2
{
    public static void main(String arg[])
    {
        int a,b,c;
        // These are the 3 variable that we need.
        float S;
        double Area;
        // These are Variables of Calculated values
        System.out.println("Enter Value of A , B , C ");
        // This will give output to enter values
        Scanner v=new Scanner(System.in);
        // It will save input as V so we can use it
        a = v.nextInt();
        b = v.nextInt();
        c = v.nextInt();
        // This will store V values in these Variables
        S = (float) (a + b + c) / 2;
        // It will store Calculated value of three sides
        Area = Math.sqrt((S-a)*(S-b)*(S-c) * S);
        // For Calculating root in java we use Math class and sqrt function Math.sqrt()
        // It will store Calculated Area of triangle with the help of Math class
        // we have to use '*' after bracket and sqrt function give answer in float/double
        System.out.println ("The Area of Triangle is --> " + Area);
        // For printing the output
    }
}
