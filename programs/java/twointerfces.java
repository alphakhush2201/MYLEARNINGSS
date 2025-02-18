import java.util.Scanner;

interface marks{
    void inp();
}
interface ages{
    void age();
}
class multiple implements marks,ages{
    Scanner sc = new Scanner(System.in);
    public void inp(){
        
        System.out.print("Enter the Marks :");
        int a = sc.nextInt();
        System.out.println("the marks is :"+ a);
    }
    public void age(){
        System.out.println("Enter the age:");
        int b = sc.nextInt();
        System.out.println("the age is :"+ b);
    }
public static void main(String[] args) {
    multiple r = new multiple();
    r.inp();
    r.age();
    
}
}
