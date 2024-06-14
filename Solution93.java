import java.io.*;
import java.util.*;

public class Solution93 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        while(true){
            int n=sc.nextInt();
            s=s+n;
            if(n==0)
                break;
        }
        System.out.print(s);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}