import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        char y=sc.next().charAt(0);
        if(x==y){
            System.out.println("NULL");
        }else if((x=='R' && y=='P')||(x=='P' && y=='S') || (x=='S' && y=='R')){
            System.out.println("Charan");
        }else{
            System.out.println("Vignesh");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
