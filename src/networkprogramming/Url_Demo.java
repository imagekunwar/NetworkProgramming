
package networkprogramming;

import java.net.*;

public class Url_Demo {
    
    public static void main(String[]args)
    {
         try {
        URL  UI= new URL("http://www.example.com:80/index.html?query.html?");
        System.out.println("protocol  ="+UI.getProtocol());
        System.out.println("host  ="+UI.getHost());
        System.out.println("file  ="+UI.getFile());
        System.out.println("port  ="+UI.getPort());
        System.out.println("path  ="+UI.getPath());
        System.out.println("query  ="+UI.getQuery());
                
         }catch (Exception e){
             System.out.println(e);
         }
    }
}
