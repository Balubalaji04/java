import java.io.*;
import java.util.*;

public class Solution37 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a>b && a>c && a>d)
            System.out.print(a);
        else if(b>a && b>c && b>d)
            System.out.print(b);
        else if(c>b && c>a && c>d)
            System.out.print(c);
        else
            System.out.print(d);
        
        
        
        
    }
}