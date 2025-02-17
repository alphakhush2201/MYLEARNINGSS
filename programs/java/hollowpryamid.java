// wap to print the following 
//      1
//     2 2 
//    3   3
//   4 4 4 4 
import java.util.Scanner;
public class hollowpryamid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        int a = sc.nextInt();
        for (int b=1; b<=a;b++){
            for(int d=a-b;d>=1;d--){
                System.out.print("  ");
            }
            for (int c=1;c<=b;c++){
                if(c==1 || c==b || b==a)
                    System.out.print(b+"   ");
                
                else
                    System.out.print("    ");

            }
            System.out.println();
        }

    }
}
