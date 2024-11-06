/* We can use Bitwise operator for Fast calculation
these are faster than normal operators bcz they are working on
Bits, but it's little bit complicated to work with these
Operators
 */
public class BitwiseOperator
{
    public static void main(String[] arg)
    {
        int x = 10, y,z;
        int u = -0b1010;
        int a = 10, b = 6,and,or,xor,not;

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

        /* This is AND"&" Bitwise Operator in java
        it acts like it is doing multiply at binary bcz
        When both numbers are 1 so it give 1 otherwise all
        of them are 0
         */
        and = a&b;
        /* This is OR"|" Bitwise Operator in java
        It acts like it is doing Addition at binary bcz
        When any of one number is 1 so it give 1 and
        when both of numbers are 0 then it gives 0
         */
        or = a|b;
        /* This is XOR"^" Bitwise Operator in Java
        It is exclusive OR it works on common ones
        if one of them are one so it give 1 otherwise
        both are 0 or 1 then it gives 0
         */
        xor = a^b;
        /* This is NOT"~" Bitwise Operator in Java
        It is simply makes number negative and ad one to it
        if you take 10 so it makes them -11.
         */
        not = ~a;
        System.out.println("This is the Output of Left shift --> " + y);
        System.out.println("This is the Output of Right shift --> " + z);
        System.out.println("This is the Output of Unsigned Right shift --> " + u);
        System.out.println("This is the Output of AND --> " + and);
        System.out.println("This is the Output of OR --> " + or);
        System.out.println("This is the Output of XOR --> " + xor);
        System.out.println("This is the Output of NOT --> " + not);

        //This is for binary representation
        System.out.println("These are the Binary Representation of Numbers");
        System.out.println("These are the Binary Representation of Numbers");
        System.out.printf("%s%n",Integer.toBinaryString(x));
        System.out.printf("%32s%n",Integer.toBinaryString(y));
    }
}
