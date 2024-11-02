import java.util.Scanner;

//It will find the root of Quadratic equation
public class RootofQuadratic
{
    public static void main(String arg[])
    {
        int a,b,c;
        // We need 3 values to Calculate root
        double r1,r2;
        // These variables will store both roots
        System.out.println("Enter the value of a, b and c ");
        // It will give the message of Enter the values
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // It will store values in a,b,c that we input
        r1 = (-b+ Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        // this is the formula of finding root 1
        r2 = (-b- Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        // this is the formula of finding root 2
        System.out.println("Roots are " + r1+" " +r2);
        // It will print both of them with message
        /* Mistakes
        1. Forgot about precedence and get confused for making
        equation so that's why equation got wronged
        Tips !
        we can use any number before Math.sqrt
         */
    }
}
