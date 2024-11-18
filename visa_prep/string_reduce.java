import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        StringBuilder res=new StringBuilder();
        int count=1;
        for(int i=1;i<in.length();i++){
            if(in.charAt(i)==in.charAt(i-1)){
                count++;
            }else{
                res.append(in.charAt(i-1)).append(count);
                count =1;
            }
        }
        res.append(in.charAt(in.length()-1)).append(count);
        System.out.println(res.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
