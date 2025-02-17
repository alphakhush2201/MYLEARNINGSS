import java.io.*;
public class filterinputoutput {
    public static void main(String[] args)throws Exception {
        File data = new File("Aditya.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String S = "Welcome to java";
        byte b[]= S.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        FileInputStream fil = new FileInputStream(data);
        FilterInputStream filte = new BufferedInputStream(fil);
        int k = 0;
        while((k=filte.read())!=-1){
            System.out.print((char)k);
        } 
        file.close();
        filte.close();
    }
}
