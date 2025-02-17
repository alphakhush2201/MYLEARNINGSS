import java.util.Scanner;
public class solidrectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length:");
        int a = sc.nextInt();
        System.out.print("enter width");
        int b =sc.nextInt();
        for(int x =0;x<a;x++){
            for(int y =0;y<b;y++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}