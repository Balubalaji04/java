import java.io.*;
import java.util.*;

public class Solution85 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int count=0;
        while(n!=0){
            int d=n%10;
            if(d%2==0)
                count++;
            n=n/10;
        }
        System.out.print(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}