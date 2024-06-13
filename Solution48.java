import java.io.*;
import java.util.*;

public class Solution48 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        
             int n=sc.nextInt();
       
        if(n>=30 &&n<=50)
            System.out.print("D");
        else if(n>=51 && n<=60)
            System.out.print("C");
        else if(n>=61 && n<=80)
            System.out.print("B");
        else
            System.out.print("A");
       
            
    }
}