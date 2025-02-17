// Wap to print the following 
// **********
// **********
// **********
import java.util.Scanner;

public class rectangularpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        int a = sc.nextInt();
        System.out.print("Enter width of rectangle:");
        int b = sc.nextInt();
        for (int c = 1;c<=b;c++){
            for( int d = 1;d<=a;d++){
                System.out.print(" * ");
            }
        }
    }
}
