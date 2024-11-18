import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=3 && a<=5){
        
            System.out.println("Spring");
        }else if(a>=6 && a<=8 ){
            System.out.println("Summer");
        }else if(a>=9&& a<=11){
            System.out.println("Autumn");

        }else if(a>12 || a==0){
            System.out.println("Invalid");
        }else {
            System.out.println("Winter");
        } 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
