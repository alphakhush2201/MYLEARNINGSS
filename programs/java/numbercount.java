import java.util.Scanner;
public class numbercount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 12345;
        int b = 0;       
        while (a>0){
            a=a/10;
            b++;   
        }
        System.out.println(b);
    }
}
