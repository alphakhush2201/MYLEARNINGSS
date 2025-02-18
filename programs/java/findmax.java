import java.util.Scanner;

public class findmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three nos:");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("max:"+a);
            }
            else{
                System.out.println("max:"+c);
            }
        }
        if (b>a){
            if (b>c){
                System.out.println("max:"+b); 
            }
            else{
                System.out.println("max:"+c);
            }
        }
    }
}