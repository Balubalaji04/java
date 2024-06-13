import java.io.*;
import java.util.*;

public class Solution4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print((num%3==0)?"Yes":"No");
    }
}