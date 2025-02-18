import java.util.Scanner;
public class assn_4_C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        while(true){
            String input = sc.nextLine();
            if(input.equals("stop")){
                break;
            }
            System.out.println("You Entered: "+input);
        }

}}
