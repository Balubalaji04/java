import java.io.*;
import java.util.*;

public class Solution51 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0)
        {
            int d=a%10;
            System.out.println(d);
            a=a/10;
        }
    }
}