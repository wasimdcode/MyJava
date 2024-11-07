/* This is the example of Using Bitwise operator as
Merging and Masking we can perform these type of operations
on Bits
 */
public class MergingMasking
{
    public static void main(String[]arg)
    {
         byte a = 9, b = 12;
         byte c;

         // We are using byte conversion and using parenthesis for ignoring error
         c = (byte) (a <<4);
         c = (byte) (c|b);
         /* We are using AND(&) for getting the one value
         of stored in a byte or 8 bits
          */
        System.out.print("This is the Values first 4 bits --> ");
        System.out.println((c&0b11110000)>>4);
        System.out.print("This is the Values last 4 bits --> ");
        System.out.println((c&0b00001111));
    }
}
