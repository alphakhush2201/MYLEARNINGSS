import java.io.*;

public class filtereaderclass {
    public static void main(String[] args) throws Exception{
        try{
            File obj = new File("/Users/khush.in/Desktop/programs/java/Sample.txt");
            FileReader fir = new FileReader(obj);
            int data ;
            while((data = fir.read())!=-1){
                System.out.print((char)data);
                
            }fir.close();
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
