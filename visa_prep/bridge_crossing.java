import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int xa=sc.nextInt();
        int ya=sc.nextInt();
        int za=sc.nextInt();
        if(ya>za){
            System.out.println("0");
        }else{
            System.out.println((za-ya)/xa);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
