import java.util.Scanner;

public class digitpryamid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int a = sc.nextInt();
        for (int b=1; b<=a; b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for (int d=1;d<=b;d++){
                System.out.print(d);
            }
            for (int e=b-1;e>=1;e--){
                System.out.print(e);
            }
            System.out.println();
        }
    }
}
