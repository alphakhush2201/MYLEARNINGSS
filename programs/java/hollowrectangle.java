// wap to print the following pattern
// ********
// *      *
// ********
import java.util.Scanner;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        int a = sc.nextInt();
        System.out.print("Enter width of rectangle:");
        int b = sc.nextInt();
        for (int c = 1;c<=b;c++){
            for( int d = 1;d<=a;d++){
                if (c==1 || c==b || d==1 || d==a)
                    System.out.print(" * ");
                    
                else
                    System.out.print("   ");
                    
            }
            System.out.println();
        }
    }
}

