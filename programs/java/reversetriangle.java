// Wap to print the following 
// ****
// ***
// **
// *
import java.util.Scanner;

public class reversetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how much you wanna make the triangle :");
        int a = sc.nextInt();
        for (int b = a; b>=1; b--){
            for ( int c= b; c>=1;c--){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
