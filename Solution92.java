import java.io.*;
import java.util.*;

public class Solution92 {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int r=0;
         while(n!=0){
           int d=n%10;
            r=r+d*d*d;
            n=n/10;
            
        }
        System.out.print((m==r)?"true":"false");
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}