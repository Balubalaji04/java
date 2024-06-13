import java.io.*;
import java.util.*;

public class Solution62 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int s=0;         
        int rev=0;

        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.print(rev);
    }
}