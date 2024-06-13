import java.io.*;
import java.util.*;

public class Solution64 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a,b;
        int n=sc.nextInt();
        
        int s=0;
        a=n%10;
        while(n!=0)
        {
            int d=n%10;
            
            s=s*10+d;
            n=n/10;
        }
        b=s%10;
        System.out.print(a+b);
    }
}