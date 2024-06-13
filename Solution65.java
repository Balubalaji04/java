import java.io.*;
import java.util.*;

public class Solution65 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int s=0;
        int p=0;
        
        while(n!=0)
        {
            int d=n%10;
            if(d%2==0)
                s=s+1;
            if(d%2 !=0)
                p=p+1;
            n=n/10;
        }
       
        System.out.println(s);
         System.out.print(p);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}