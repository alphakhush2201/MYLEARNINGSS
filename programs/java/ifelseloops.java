import java.util.Scanner;

public class ifelseloops {
   public static void main(String[] args) {
      System.out.println("enter what do you want to choose ?");
      System.out.println("1. for for loop");
      System.out.println("2. for while loop");
      System.out.println("3. for do while loop ");
      System.out.print(":");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      if (a==1){
         for(int b=1;b<=10;b++){
            System.out.println(2*b);
         }
      }
      else if (a==2){
         int c=1;
         while(c<=10){
            System.out.println(2*c);
            c++;
         }
      }
      else if (a==3){
         int b=1;
         do{
            System.out.println(2*b);
            b++;
         }
         while(b<=10);
      }
      else{
         System.out.println("Invalid Input !");
      }
      }
   }

