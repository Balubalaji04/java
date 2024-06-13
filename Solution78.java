import java.io.*;
import java.util.*;

public class Solution78 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int so=0,se=0;
        while(n!=0){
            int d=n%10;
            if(d%2==0){
                se=se+d;
            }
            else
                so=so+d;
            n=n/10;
        }
        System.out.print(so*se);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}