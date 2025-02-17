import java.util.Scanner;
class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter what factorial you want to find:");
        int a = sc.nextInt();
        int b = 0;
        while (a>0){
            b+=a;
            a--;
        }
        System.out.println("The factorial is "+b);
    }
}