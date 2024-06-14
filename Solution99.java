import java.io.*;
import java.util.*;

public class Solution99 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0,h=s.length()-1;
        int r=0;
        while(l<=h){
            if(l!=0 || h!=s.length()-1)
                r=r+(s.charAt(l)-48)+(s.charAt(h)-48);
            l++;
            h--;
                
        }
        System.out.print(r);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}