import java.io.*;
import java.util.*;

public class Solution74 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        while(n!=0){
            int d=n%10;
            s=s*d;
            n=n/10;
            
        }
        System.out.print(s);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}