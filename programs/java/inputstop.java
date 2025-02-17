import java.util.Scanner;

public class inputstop {
    public static void main(String[] args) {
        String input; 
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine(); 
        while(true){
            if (input=="stop"){
                break;
            }
            else{
            input = sc.nextLine();
        }}
        System.out.println("the program has ended!");
    }
}
