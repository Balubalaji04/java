import java.io.*;
import java.util.*;

public class Solution31 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int aa=Math.abs(a-10);
        int bb=Math.abs(b-10);
        if(aa-bb==0)
            System.out.print("0");
        else
            System.out.print((aa<bb)?a:b);
    }
}