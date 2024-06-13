import java.io.*;
import java.util.*;

public class Solution53 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while(a!=0)
        {
            int d=a%10;
            if(d%2==0)
                s=s+d;
            a=a/10;
        }
        System.out.print(s);
    }
}