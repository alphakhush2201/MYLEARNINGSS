//find a to the power b using loop
import java.util.Scanner;
public class atothepowerb {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a :");
    int a = sc.nextInt();
    int c = 1 ;
    System.out.print("Enter b:");
    int b = sc.nextInt();
    while (b>0){
        c*=a;
        b--;
    }
    System.out.println("a raised to the power b is :"+c);
   }
}
