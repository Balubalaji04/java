import java.io.*;
import java.util.*;

public class Solution77 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int s=0;
        while(n!=0){
            int d=n%10;
            s=s+d;
            n=n/10;
            
        }if(m%s==0)
            System.out.print("Yes");
        else
             System.out.print("No");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}