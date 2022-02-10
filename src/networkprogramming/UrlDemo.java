
package networkprogramming;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.InputStream;
import java.io.IOException;
import java.net.URLConnection;

public class UrlDemo {
    
    public static void main(String[]args){
        try{
        URL url=new URL("http://www.scst.edu.np/academics/computer-application/course-structure");
        System.out.println("Protocol:"+url.getProtocol());
        System.out.println("Port:"+url.getPort());
        System.out.println("Host:"+url.getHost());
        System.out.println("File:"+url.getFile());
        
        
        URLConnection UrlCon=url.openConnection();
       
            InputStream Stream=UrlCon.getInputStream();
            
            int i;
            while((i=Stream.read())!=-1){
            System.out.println((char)i);
        }
                    
        
    }
        catch(MalformedURLException e){
            System.out.println("Exception handled successfully"+e);
        }
        catch(IOException ex){
            System.out.println("IO exception handled");
        }
    
}
    }
