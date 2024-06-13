import java.io.*;
import java.util.*;

public class Solution80 {

  


    public static int rev(int n){
        int d,rev=0;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=rev(n);
        System.out.print(Math.abs(n-s));
        
               /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}