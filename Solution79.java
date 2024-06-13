import java.io.*;
import java.util.*;

public class Solution79 {
    public static int sum(int n){
        int d,s=0;
        while(n!=0){
            d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(true){
            if(n>=0 && n<=9){
               System.out.print(n);
                break;
            }
            n=sum(n);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}