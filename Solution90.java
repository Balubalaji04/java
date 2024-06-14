import java.io.*;
import java.util.*;

public class Solution90 {
        public static int rev(int n){
            int d,r=0;
            while(n!=0){
                d=n%10;
                r=r*10+d;
                n=n/10;
            
            }
            return r;
        
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=rev(n);
        int d,s=0;
        while(n!=0){
            d=n%10;
            d=d-1;
            s=s*10+d;
            n=n/10;
        }
        System.out.print(s);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}