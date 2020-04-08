import java.io.*;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d =4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);
        int myInt;
        double mydouble;
        String myString;

        myInt = scan.nextInt();
        mydouble = scan.nextDouble();
        scan.nextLine();
        myString = scan.nextLine();

        //For the Integer
        System.out.println(myInt + i);

        //For the double data type
        System.out.println(mydouble + d);

        //For the String
        System.out.println(s + myString );

        scan.close();
    }
}
