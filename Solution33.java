import java.io.*;
import java.util.*;

public class Solution33 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19))
            System.out.print("true");
        else
            System.out.print("false");
    }
}