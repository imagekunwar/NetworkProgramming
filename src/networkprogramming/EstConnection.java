
package networkprogramming;
import java.net.*;

public class EstConnection {
    public static void main(String[]args) throws Exception{
        URL url=new URL("http://scst.edu.np/academics/computer-application/introduction");
        HttpURLConnection http=(HttpURLConnection) url.openConnection();
        System.out.println("The connected URL is"+http.getURL());
        
        
    }
}
