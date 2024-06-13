import java.io.*;
import java.util.*;

public class Solution39 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            if(n>=2 && n<=5)
                System.out.print("not weird");
            else if(n>=6 && n<=20)
                System.out.print("weird");
            else
                System.out.print("not weird");
        }
        else
            System.out.print("weird");
    }
}