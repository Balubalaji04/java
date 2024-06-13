import java.io.*;
import java.util.*;

public class Solution9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n%10+(n/10)%10+(n/100)%10);
        
    }
}