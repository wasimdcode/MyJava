/* This will Calculate Compound Interest
this will do work, but it needs more improvement
with the use of switch case I will do it when
i will learn this topic but for now it's working
 */
import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String[]args)
    {
        double principal,rate,time;
        int compound;
        double finalAmount;


        Scanner v=new Scanner(System.in);
        System.out.print("Enter Principal Amount(Initial Investment) --> ");
        principal = v.nextDouble();
        System.out.print("Enter Annual Interest Rate (%) --> ");
        rate = v.nextDouble() / 100;
        System.out.print("Enter Time Period in Years --> ");
        time = v.nextDouble();
        System.out.print("Enter Compounding Frequency --> ");
        compound = v.nextInt();

        /* This is the formula for calculating Compound Interest */
        finalAmount = principal * Math.pow( 1 + rate / compound,  compound * time);
        double interestEarned = finalAmount - principal;

        /* These are some formatted outputs by Claude.AI i didn't do it by
        myself bcz i don't know what is going here but my main focus was creating
        calculation so i did that but in future i will learn this formatted printing
         */
        System.out.printf("\nPrincipal Amount: $%.2f%n", principal);
        System.out.printf("Interest Rate: %.1f%%%n", rate * 100);
        System.out.printf("Time Period: %.1f years%n", time);
        System.out.printf("Final Amount: $%.2f%n", finalAmount);
        System.out.printf("Interest Earned: $%.2f%n", interestEarned);
    }
}
