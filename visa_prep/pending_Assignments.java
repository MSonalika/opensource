import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int xx=sc.nextInt();
        int yy=sc.nextInt();
        int zz=sc.nextInt();
        if((xx*yy)<=(zz*1440)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
