import java.io.*;
import java.util.*;

public class Solution76 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n!=0){
            int d=n%10;
            if(d==2 || d==3 || d==5 || d==7 )
                s=s+d;
            n=n/10;
            
        }
        System.out.print(s);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}