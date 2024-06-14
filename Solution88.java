import java.io.*;
import java.util.*;

public class Solution88 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int k=sc.nextInt();
        while(n!=0){
            int d=n%10;
            if(d==k){
                count++;
            }
           
            n=n/10;
        }
        System.out.print(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}