import java.io.*;
import java.util.*;

public class Solution46 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
             int n=sc.nextInt();
        if(n%3==0 && n%5==0)
            System.out.print("FizzBuzz");
        else if(n%3==0 && n%5!=0)
            System.out.print("Fizz");
        else if(n%3 != 0 && n%5==0)
            System.out.print("Buzz");
        
        else
            System.out.print(n);
            
        
        
        
       
        
    }
}