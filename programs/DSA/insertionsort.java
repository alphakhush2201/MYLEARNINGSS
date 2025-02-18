package DSA;

public class insertionsort {
    public static void insert(int input[]){
        for(int i = 1;i<input.length;i++){
            int j = i-1;
            int temp = input[i];

            while(j>=0 && input[j]>temp){
                input[j+1]=input[j];
                j--;

            }
            input[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int input[]={9,34,4,54,3,23,432,23,34,54,32,33};
        insert(input);
        for(int i =0;i<input.length;i++){
            System.out.print(input[i]+", ");
        }
    }
}
