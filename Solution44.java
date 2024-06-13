import java.io.*;
import java.util.*;

public class Solution44 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c && c==a)
            System.out.print("0");
        else if(a==b)
            System.out.print(c);
        else if(b==c)
            System.out.print(a);
        else if(a==c)
            System.out.print(b);
        else
            System.out.print(a+b+c);
        
            
    }
}