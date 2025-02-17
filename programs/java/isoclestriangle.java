// write a program to print the pyramid
//           * 
//         *   * 
//       *   *   * 
//     *   *   *   * 
//   *   *   *   *   * 
import java.util.Scanner;

public class isoclestriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how much time you want to run:");
        int a = sc.nextInt();
        for ( int b = 1; b<=a; b++){
            for ( int c = 1 ; c<=a-b; c++){
                System.out.print("  ");
            }
            for (int d=1;d<=b; d++){
                System.out.print("  * ");
            }
            System.out.println();
        }
        

    }
}
