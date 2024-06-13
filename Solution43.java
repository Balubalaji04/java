import java.io.*;
import java.util.*;

public class Solution43 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
             int n=sc.nextInt();
        if(n==1)
        {
            System.out.print("Hello "+s);
        }
        else
            System.out.print("Bye "+s);
       
        
    }
}