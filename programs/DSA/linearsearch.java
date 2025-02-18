package DSA;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,6,7,8,9,10};
    Scanner sc = new Scanner(System.in);
    System.out.println("What element would you like to find ??");
    int a = sc.nextInt();
    for(int i = 0 ; i<arr.length;i++){
        if(a==arr[i]){
            System.out.println("found it on index="+i);
        }
    }
    }
    
}
