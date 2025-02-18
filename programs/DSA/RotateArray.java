package DSA;

import java.util.Scanner;

public class RotateArray {
    public static int[] rotatearray(int a , int arr[]){
        int temp[] = new int[arr.length];
        int k = 0 ;
        for (int i = a;i<arr.length;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i = 0;i<a;i++){
            temp[k]=arr[i];
            k++;
        }
        return temp;
        
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element from which you want to reverse the array:");
        int a = sc.nextInt();
        int ans[]= rotatearray(a, arr);
        for(int i = 0 ; i<ans.length;i++){
            System.out.print(ans[i]+", ");
        }
    }
}
