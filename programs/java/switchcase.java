import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1: System.out.println("test a ");
                break; 
            case 2 : System.out.println("test b ");
            break ; 
            default: System.out.println("das wassup ");
        }
    }
}
