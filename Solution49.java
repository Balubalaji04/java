import java.io.*;
import java.util.*;

public class Solution49 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
             int n=sc.nextInt();
        int a=n*n*n;
        System.out.print((a%10==n)?"true":"false");
       
        
       
            
    }
}