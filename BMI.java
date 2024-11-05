/* This is BMI (Body Mass Index) Calculator based on
equation of International System of Units (SI)
 */
import java.util.Scanner;

public class BMI
{
    public static void main(String arg[])
    {
        // These Variables for storing Values for equation
        float weight,height;
        float BMI;

        // These will print MSG for giving the input values
        System.out.print("Enter Your Body Weight in Kg --> ");
        Scanner v=new Scanner(System.in);
        weight = (float) v.nextDouble();
        System.out.print("Enter Your Height in Meters --> ");
        height = (float) v.nextDouble();

        /* This is the formula for calculating BMI
        which is Weight / Height's power 2
         */
        BMI = (float) (weight / Math.pow(height, 2));

        System.out.println("Your BMI is --> " + BMI);
    }
}
