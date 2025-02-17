package DSA;
//The Dutch National Flag Problem 
/*// Khushwant Singh Chouhan //*/ 
public class TheDutchNationalFlag { // Method Created 
    public static void sort(int arr[]){
        int current = 0 ; //to keep the track of element in the iteration 
        int zero = 0 ;     // for shifting zeroes to the left
        int two = arr.length-1; // for shifting two's to the righ 

        while(current<=two){ //starting iteration 
            if(arr[current]==0){
                int temp = arr[current];
                arr[current] = arr[zero]; //shifting one's to the left 
                arr[zero]=temp;
                zero++;
                current++;
            }
            else if(arr[current]==2){
                int temp = arr[current];// shifting two's to the righ 
                arr[current]=arr[two];
                arr[two]=temp;
                two--;
            }
            else{
                current++; // keeping one's in the middle 
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,2,1,0,2,0,1,1,2};
        sort(arr);  // calling the sort method
        for(int i:arr){
            System.out.print(i+", "); // printing the output using for each loop 
        }
    }
}
