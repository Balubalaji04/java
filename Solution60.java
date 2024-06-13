import java.io.*;
import java.util.*;

public class Solution60 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int x=10;
        while(n!=0)
        {
            int d=n%10;
            if(d<x)
                x=d;
            n=n/10;
        }
        System.out.print(x);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}