
public class Swapping
{
    public static void main(String[]arg)
    {
        int a,b;

        // These are the values in binary form a = 10 b = 9
        a = 0b1010;
        b = 0b1001;

        // These will print values after every calculation
        System.out.println("These are the Orginal values of A -> "+ a +" & B -> " + b);
        a = a^b;
        System.out.println("This is after 1st try value of A -> " + a);
        b = a^b;
        System.out.println("This is after 2nd try value of B -> " + b);
        a = a^b;
        System.out.println("This is after 3rd try value of A -> " + a + " & B -> " + b);
    }
}
