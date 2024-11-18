import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            sum+=arr1[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=sum-leftsum-arr1[i];
            arr2[i]=Math.abs(leftsum-rightsum);
            leftsum+=arr1[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
