import java.io.*;
import java.util.Scanner; ;

public class filewriterclass {
   public static void main(String[] args) throws Exception {
    try{
        Scanner sc = new Scanner(System.in);
        File obj = new File("Sample.txt");
        FileWriter fiw = new FileWriter(obj);
        System.out.println("1.for method a ;");
        System.out.println("2. for method b");
        int a = sc.nextInt();
        if (a==1){
        char c [] = {'K','h','u','s','h'};
        fiw.write(c);
        }
        else if(a==2){
            String name = "Khush";
            fiw.write(name);
        }
        else{
            System.out.println("Invalid Output");
        }
        fiw.close();    
        System.out.println("File writing Succesfully !");
   }
   catch(Exception e){
    System.out.println(e.getMessage());
   }
}

}


