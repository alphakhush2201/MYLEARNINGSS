// write a program to print the sum of series S = 1-2+3-4+5......n
import java.util.Scanner;
public class series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till how much you want to run the series:");
        int a = sc.nextInt();
        int c = 0;
        for (int b=1;b<=a;b++){
            if (b%2!=0){
                c+=b;
            }
            else{
                c-=b;
            }
        }
        System.out.println("The sum of the series is :"+c);
    }
}

