import java.util.Scanner;
class addnosindigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no:");
        int a = sc.nextInt();
        int b = 0;
        while (a>0){
            b+=a%10;
            a/=10;
        }
        System.out.println("the sum of digits of no is "+b);
    }
}
