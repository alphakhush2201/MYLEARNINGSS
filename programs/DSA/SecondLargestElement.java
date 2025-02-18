package DSA;

public class SecondLargestElement {
public static int secondlargestelement(int arr[]){
    int a=0 ;
    int b=0;
    for(int i = 0 ; i<arr.length;i++){
        if(arr[i]>a){
            b = a;
            a = arr[i];
        }
    }
    return b;
    
}
public static void main(String[] args) {
    int arr[]= {9,6,4,8,5,3,2,10,11};
    int a = secondlargestelement(arr);
    System.out.print(a);
}

}
