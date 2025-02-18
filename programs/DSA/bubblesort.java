package DSA;
public class bubblesort{
    public static void bubble(int input[]){
        for (int i = 0;i<input.length-1;i++){
            for (int j = 0;j<input.length-1;j++){
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]= input[j+1];
                    input[j+1]= temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int input[]={2,34,434,56,554,3,23,54,45,45};
        bubble(input);
        for(int i = 0;i<input.length;i++){
            System.out.print(input[i]+", ");
        }
    }
}