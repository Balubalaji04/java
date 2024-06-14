import java.io.*;
import java.util.*;

public class Solution98 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int count=0;
        int d,r=0;
        
        while(n!=0){
            d=n%10;
            count++;
           
            n=n/10;
        }
            
        System.out.println((count%2==0)?"true":"false");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}