import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ue=gue(arr);
        for(int num:ue){
            System.out.print(num+ " ");
        }
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

    public static List<Integer> gue(int[] arr ){
        Set<Integer> seen=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int num:arr){
            if(!seen.contains(num)){
                seen.add(num);
                res.add(num);
            }
        }
        return res;
    }
        
    
}
