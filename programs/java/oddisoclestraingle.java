// wap to print the following pattern 
//    *
//   ***
//  *****
// *******
import java.util.Scanner;

public class oddisoclestraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How big pattern (odd no only):");
        int a = sc.nextInt();
        for (int b = 1; b<=a; b++){
            for (int c = 1; c<=a-b; c++){
                System.out.print(" ");
            }
            for (int d = 1;d<=2*b-1; d++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
