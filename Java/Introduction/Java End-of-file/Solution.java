import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNextLine())
        {
            String n= scan.nextLine();
            System.out.format("%d %s%n",i,n);
            i++;
        }
    }
}
