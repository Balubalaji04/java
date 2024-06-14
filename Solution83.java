import java.io.*;
import java.util.*;

public class Solution83 {
    public static int rev(int n){
            int d,s=0;
            while(n!=0){
                d=n%10;
                s=s*10+d;
                n=n/10;
            }
            return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=rev(n);
        
        while(n!=0){
            int d=n%10;
            if(d%2==0){
                System.out.print(d+1);
            }
            else
                 System.out.print(d-1);
            n=n/10;
        }
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}