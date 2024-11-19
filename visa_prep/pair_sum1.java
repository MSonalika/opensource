import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n<=0){
               System.out.println("false");
               return;
            }
           int a[]=new int[n];
           for(int i=0;i<n;i++){
                if(sc.hasNextInt()){
                    a[i]=sc.nextInt();
              }
            }
           if(!sc.hasNextInt()){
                System.out.println("false");
                return;
            }
           int k=sc.nextInt();
            for(int i=0;i<n-1;i++){
             for(int j=i+1;j<n;j++){
                    if(a[i]+a[j]==k){
                        System.out.println("true");
                        return;
                  }
                }
           }
            System.out.println("false");
        }catch(Exception e){
            System.out.println("false");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
