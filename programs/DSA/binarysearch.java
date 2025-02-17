package DSA;

import java.util.Scanner;

public class binarysearch {
    int binarySearch(int arr[],int x){
        int start = 0 , end = arr.length-1;
        while(start <=end){
            int mid = start + (end - start) / 2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
            start = mid+1;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18,19};
       Scanner sc = new Scanner(System.in);
       binarysearch ob = new binarysearch();
       System.out.print("Enter the element You'd like to find :");
        int x = sc.nextInt();
        
        int result =ob.binarySearch(arr, x);
        if (result==-1){
            System.out.println("Cannot be found !");
        }
        else{
            System.out.println("element is found on index:"+result);
        }

    }
    
}
