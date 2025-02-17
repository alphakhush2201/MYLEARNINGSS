import java.io.*;
public class linewordcharcounter {
   public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("/Users/khush.in/Desktop/programs/java/Khush.txt");
    int i;
    int linecount= 1 , wordcount= 1 ,charcount=0;
    char c;
    while((i= fr.read()) != -1){
        c = (char)i;
        if(i==' '||i=='\n'){}
        else{
        charcount++;
        }
        if(i=='\n'){
            linecount++;
    }
        if(i==' '|| i=='\n'){
            wordcount++;
    }
        
   }
   fr.close();
   System.out.println("LineCount= "+linecount);
   System.out.println("WordCount= "+ wordcount);
   System.out.println("CharCount= "+charcount);

}
}