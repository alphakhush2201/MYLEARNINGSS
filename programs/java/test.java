import java.net.*;
import java.io.*;
public class test{
    public static void main(String[] args)throws IOException{
      URL url = new URL("https://pagalworld3.net/14447/02%20Dekhte%20Dekhte%20-\n" + //
                    "%20Batti%20Gul%20Meter%20Chalu.mp3\"");
                    InputStream is = url.openStream();
                    FileOutputStream fout = new FileOutputStream(/Users/khushwantsinghchouhan/Downloads/xyz.mp3);
                    int c;
                    while((c=is.read())!=-1){
                        fout.write(c);

                    }
                    fout.close();
                    is.close();
        
    }
}