import java.io.*;
import java.util.*;

public class Solution47 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
             int n=sc.nextInt();
        int a=2024-n;
        if(a<18)
            System.out.print("3");
        else if(a>=18 && a<60)
            System.out.print("2");
        else
            System.out.print("1");
       
            
        
        
        
    }
}