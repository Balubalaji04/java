import java.io.*;
import java.util.*;

public class Solution84 {
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
        int a=rev(n);
        System.out.print(Math.abs(n-a));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}