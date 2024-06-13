import java.io.*;
import java.util.*;

public class Solution75 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        while(n!=0){
            int d=n%10;
            count++;
            n=n/10;
            
        }
        if(count==k){
            System.out.print("True "+count);
        }
        else{
            System.out.print("False "+count);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}