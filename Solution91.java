import java.io.*;
import java.util.*;

public class Solution91 {
    public static int rev(int n){
        int d,r=0;
        while(n!=0){
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=rev(n);
        while(n!=0){
            int d=n%10;
           switch(d){



case 0:

System.out.print("Zero "); break;
case 1:

System.out.print("One "); break;



case 2:

System.out.print("Two "); break;

case 3:


System.out.print("Three "); break;

case 4:



System.out.print("Four "); break;



case 5:



System.out.print("Five "); break;



case 6:



System.out.print("Six "); break;



case 7:



System.out.print("Seven "); break;

case 8:



System.out.print("Eight "); break;



case 9:



System.out.print("Nine "); break;
           }
            n=n/10;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}