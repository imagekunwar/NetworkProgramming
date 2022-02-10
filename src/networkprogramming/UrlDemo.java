
package networkprogramming;
import java.net.URL;
import java.net.MalformedURLException;

public class UrlDemo {
    
    public static void main(String[]args){
        try{
        URL url=new URL("http://www.scst.edu.np/academics/computer-application/course-structure");
        System.out.println("Protocol:"+url.getProtocol());
        System.out.println("Port:"+url.getPort());
        System.out.println("Host:"+url.getHost());
        System.out.println("File:"+url.getFile());
    }
        catch(MalformedURLException e){
            System.out.println("Exception handled successfully"+e);
        }
    
}
    }
