
package networkprogramming;
import java.io.*;
import java.net.*;

public class EncoderTest1 {
   
public static void main(String[] args)throws Exception {
String query = URLEncoder.encode("https://www.google.com/search?hl=en&as_q=Java&as_epq=I/O", "UTF-8");
System.out.println(query);

}
    
}
