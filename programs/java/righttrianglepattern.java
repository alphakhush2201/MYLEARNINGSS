//wap to print the following pattern 
// *
// * *
// * * *
// * * * *
import java.util.Scanner;

public class righttrianglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how big you want to print the triangle:");
        int a = sc.nextInt();
        for(int b=1; b<=a; b++){
            for(int c=1; c<=b; c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
