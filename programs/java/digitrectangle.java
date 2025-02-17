import java.util.Scanner;

public class digitrectangle {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length:");
    int a = sc.nextInt();
    System.out.print("enter width:");
    int c = sc.nextInt();
    for (int b=1; b<=a; b++){
        for (int d=1; d<=c;d++){
            System.out.print(d);
        }
        System.out.println();
    }
   }
}
