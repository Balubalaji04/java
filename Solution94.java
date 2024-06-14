import java.io.*;
import java.util.*;

public class Solution94 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int c=0,c1=0;
        while(true){
            int n=sc.nextInt();
            if(n>0)
                c++;
            if(n<0)
                c1++;
            if(n==0)
                break;
        }
        System.out.println(c);
        System.out.println(c1);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}