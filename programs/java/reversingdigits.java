import java.util.Scanner;
public class reversingdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit:");
        int a = sc.nextInt();
        int ans = 0;
        while (a >0){
            ans=ans*10+a%10;
            a/=10;
        }
        System.out.println("the reversed digits:"+ans);
    }
}
