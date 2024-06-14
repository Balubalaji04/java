import java.io.*;
import java.util.*;

public class Solution87 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int count=0,count1=0,k=sc.nextInt();
        while(n!=0){
            int d=n%10;
            if(d==k){
                count++;
            }
            count1++;
            n=n/10;
        }
        System.out.print(count1-count);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}