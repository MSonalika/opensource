import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=sc.nextInt();
        if(c<a){
            System.out.println("0");
        }else if(c>=(a+b)){
            System.out.println("2");
        }else{
            System.out.println("1");
        }
    }
}
