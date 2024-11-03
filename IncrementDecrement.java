
public class IncrementDecrement {

    public static void main(String args[]) 
    {
        int x=5,y;
        y = x++;
        //We have to decide before using Increment or decremnt 
        // 'y = ++x' when we want to increase value first then asign it to Y
        // 'y = x++' when we want to assign first to Y then increase value
        char z='A';
        // It also worked on Characters bcz thier code is ex. A = 65, so it can be increased
        ++z;
        float f=2.6f;
        // It also worked on Float type
        ++f;
        byte b=5;
        /* it worked on byte too 
        use of it on byte it's because 
        we can't use b=b+1 bcz answer will be integer so for increasing 
        byte we use increment ++b;
        */
        ++b;
        System.out.println(y+" "+x);
        System.out.println(z);
        System.out.println(f);
        System.out.println(b);
    }
}
