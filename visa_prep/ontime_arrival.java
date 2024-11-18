import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int time=30;
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            if(x>=time){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
