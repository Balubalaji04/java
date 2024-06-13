import java.io.*;
import java.util.*;

public class Solution38 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        if(a<b && a<c && a<d && a<e)
            System.out.print(a);
        else if(b<a && b<c && b<d && b<e)
            System.out.print(b);
        else if(c<b && c<a && c<d && c<e)
            System.out.print(c);
        else if(d<b && d<a && d<c && d<e)
            System.out.print(d);
        else
            System.out.print(e);
        
    }
}