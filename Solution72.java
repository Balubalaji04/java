import java.io.*;
import java.util.*;

public class Solution72 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=-1;
        while(n!=0){
            
        
        int d=n%10;
            
            if(max<d)
                max=d;  
            n=n/10;
            
        }
        System.out.print(max);
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}