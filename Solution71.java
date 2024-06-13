import java.io.*;
import java.util.*;

public class Solution71 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int d=n%10;
            d=d*d;
            if(d%10==d)
            {rev=rev*10+d;}
            else 
            {rev=rev*100+d;}    
            n=n/10;
            
        }
        System.out.print(rev);
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}