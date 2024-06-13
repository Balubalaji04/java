import java.io.*;
import java.util.*;

public class Solution35 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        a=255-a;
        b=255-b;
        c=255-c;
        System.out.print(a+" "+b+" "+c);
    }
}