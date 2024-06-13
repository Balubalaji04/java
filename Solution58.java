import java.io.*;
import java.util.*;

public class Solution58 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int s=0;
        while(a!=0)
        {
            int d=a%10;
            if(d==n)
                s=s+1;
            a=a/10;
        }
        System.out.print(s);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}