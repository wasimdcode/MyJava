/* We can use Bitwise operator for Fast calculation
these are faster than normal operators bcz they are working on
Bits, but it's little bit complicated to work with these
Operators
 */
public class BitwiseOperator
{
    public static void main(String arg[])
    {
        int x = 10, y,z,u;
        u = -10;

        /* This is the Left Shift Bitwise Operator "<<"
        We can use this for multiplying values n*2's power k
         */
        y = x<<1;

        /* This is the Right Shift Bitwise Operator ">>"
        We can use this for Dividing values n/2's power k
         */
        z = x>>1;
        /* This is the Unsigned Right Shift Bitwise Operator ">>>"
        Which is used to convert Negative(-) value into Positive(+)
         */
        u = x>>>1;
        System.out.println("This is the Output of Left shift --> " + y);
        System.out.println("This is the Output of Right shift --> " + z);
        System.out.println("This is the Output of Unsigned Right shift --> " + u);
    }
}
