import java.io.*;
import java.util.*;

public class Solution34 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print((a%3==0 || a%5==0)?"true":"false");
    }
}