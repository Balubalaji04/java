import java.io.*;
import java.util.*;

public class Solution59 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int x=0;
        while(n!=0)
        {
            int d=n%10;
            if(d>x)
                x=d;
            n=n/10;
        }
        System.out.print(x);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}