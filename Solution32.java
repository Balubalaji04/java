import java.io.*;
import java.util.*;

public class Solution32 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print((((a>=30 && a<=40) && (b>=30 && b<=40)) || ((a>=40 && a<=50) && (b>=40 && b<=50)))?"true":"false");
    }
}