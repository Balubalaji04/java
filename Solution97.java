import java.io.*;
import java.util.*;

public class Solution97 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int count=0;
        int d,r=0;
        
        while(n!=0){
            d=n%10;
            count++;
            r=r+d;
            n=n/10;
        }
            
        System.out.println(r/count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}