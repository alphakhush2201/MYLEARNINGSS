import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int result = A.compareTo(B);
        if(result==-1){
          System.out.println("Yes");
        }
        else{
         System.out.println("No");
        }
        System.out.println(A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0)))+" "+B.replace(B.charAt(0),Character.toUpperCase(B.charAt(0))));
    }
}



