import java.util.Scanner;

public class digit1rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int a = sc.nextInt();
        System.out.print("Enter Width:");
        int b = sc.nextInt();
        for (int c = 1; c<=a; c++){
            for (int d =1; d<=b;d++){
                if ((c+d)%2==0)
                    System.out.print(1);
                else
                    System.out.print(2);
            }
            System.out.println();
        }
    }
}
