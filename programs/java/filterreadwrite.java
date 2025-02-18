//WAP to give an example of filter Input and output stream class
import java.io.*;

public class filterreadwrite {
   public static void main(String[] args) {
    try{
    File data = new File("Sample.txt");
    FileOutputStream file = new FileOutputStream(data);
    FilterOutputStream filter = new FilterOutputStream(file);
    String S = "Welcome to java";
    byte b[] = S.getBytes();
    filter.write(b);
    filter.flush();
    filter.close();
    file.close();
    System.out.println("Success");

    FileInputStream fil = new FileInputStream(data);
    FilterInputStream filte = new BufferedInputStream(fil);
    int k = 0;
    try{
    while((k= filte.read())!= -1){
        System.out.print((char)k);
        Thread.sleep(1000);
    }}
    catch(Exception e){
        System.out.println("error");
    }
    fil.close();
    filte.close();}
    catch(Exception IO){
        System.out.println("Error");
    }
    }
   }