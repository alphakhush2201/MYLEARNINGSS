package DSA;

public class CheckArrayRotation {
    public static int checkarrayrotation(int arr[]){
        int a = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                a=i-2;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4};
        int a = checkarrayrotation(arr);
        System.out.println(a);
    }
}
