package DSA;
public class PushToZeroes {
    public static int[] push(int arr[]){
        int []ans = new int[arr.length];
        int a = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]!=0){
            ans[a]=arr[i];
               a++; 
            }}
            while(a<arr.length){
                ans[a]=0;
                a++;
            }
            return ans;
        }
    public static void main(String[] args) {
        int arr[]={2,0,4,1,3,0,28};
    int a[]= push(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(a[i]+", ");
        }

    }
}
