import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m>=n){
                System.out.println("0");
            }else{
                System.out.println(n-m);
            }
            
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
