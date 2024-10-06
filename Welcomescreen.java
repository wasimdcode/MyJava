import java.awt.*;
import java.util.Scanner;

public class Welcomescreen {
    public static void main(String args[]){
        Scanner s=new  Scanner(System.in);
        String name;
        System.out.println("May i know your Name ");
        name = s.nextLine();
        System.out.println("Welcome Mr/Mrs." + name );

    }
}
