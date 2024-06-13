import java.io.*;
import java.util.*;

public class Solution25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int p,q,r;
        p=a-b;
        q=c-d;
        r=e-f;
        if(p>r && p>q)
            System.out.print(p);
        else if(q>r && q>p)
            System.out.print(q);
        else
            System.out.print(r);


    }
}