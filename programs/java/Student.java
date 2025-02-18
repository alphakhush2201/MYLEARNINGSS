import java.util.Scanner;
public class Student{             /** programmed by Khushwant Singh Chouhan  */
    String name;
    int age;
    int fee;
    public void DisplayData(){
    System.out.println("The student name is :"+name);
    System.out.println("the age is :"+age);
    System.out.println("The fee is :"+fee);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter the Student 1 name:");
        s1.name = sc.next();
        System.out.print("Enter Student 1 age:");
        s1.age =  sc.nextInt();
        System.out.print("Enter Student 1 fee:");
        s1.fee = sc.nextInt();
        s1.DisplayData();
        
        Student s2 = new Student();
        System.out.print("Enter the Student 2 name:");
        s2.name = sc.nextLine();
        System.out.println();
        System.out.print("Enter Student 2 age:");
        s2.age =  sc.nextInt();
        System.out.print("Enter Student 2 fee:");
        s2.fee = sc.nextInt();
        s2.DisplayData();
       

    }
}