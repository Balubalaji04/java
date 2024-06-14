import java.io.*;
import java.util.*;

public class Solution96 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int d,r=0;
        int l=0,h=s.length()-1;
        while(l<=h){
            r=r+(s.charAt(l)-48)+(s.charAt(h)-48);
            l++;
            h--;
        }
            
        System.out.println(r);
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}