/* This will Convert Dollars in Indian rupees so
it will be easy to know the actual price of anything
in india
 */
import java.util.Scanner;
public class CurrencyConvertor
{
    public static void main(String[]arg)
    {
        double dollar,rupee;
        System.out.print("Enter Amount in Dollar $ --> ");
        Scanner d=new Scanner(System.in);
        dollar = d.nextDouble();

        /* This is Just Multiplier it will just multiply rate of indian
        rupees into dollar so it's not big deal to do it
         */
        rupee = 84.37 * dollar;
        System.out.println( (int) dollar + " Dollars in Indian rupees is --> " + "₹ " + rupee);
    }
}
