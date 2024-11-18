import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mini=-2147483648;
        int maxi=2147483647;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            n/=10;
            if(rev>(maxi/10)||rev==maxi/10 && digit>7){
                System.out.println(0);
                return;
            }
            if(rev<(mini/10)||(rev==mini/10 && digit<-8)){
                System.out.println(0);
                return ;
            }
            rev=rev*10+digit;
        }
        System.out.println(rev);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
