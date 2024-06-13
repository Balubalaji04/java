import java.io.*;
import java.util.*;

public class Solution29 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b && a<c)
            System.out.print(a);
        else if(b<a && b<c)
            System.out.print(b);
        else
            System.out.print(c);
    }
}