import java.io.*;
import java.util.*;

public class Solution40 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=(n%10)+((n/10)%10);
        System.out.print((s*s==n)?"true":"false");
        
    }
}