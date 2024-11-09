/* This is Simple Interest Calculator
you just have to enter 3 inputs
and you will get the calculated amount
 */
import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[]arg)
        {
        double principal,rate,time;
        double simpleInterest;

        Scanner v=new Scanner(System.in);
        System.out.print("Enter Principal amount --> ");
        principal = v.nextDouble();
        System.out.print("Enter Rate of Interest --> ");
        rate = v.nextDouble();
        System.out.print("Enter Time in years --> ");
        time = v.nextDouble();

        simpleInterest = (principal * rate * time) / 100;
        System.out.println("Your Simple Interest --> " + simpleInterest);
        System.out.print("Your Total Amount --> " + (principal + simpleInterest));
    }
}
