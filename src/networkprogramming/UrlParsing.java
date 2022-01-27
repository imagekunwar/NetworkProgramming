
package networkprogramming;
import java.net.URL;
public class UrlParsing {
    public static void main(String[]args){
        try{
        URL up =new URL("ftp://mp3:mp3@192.168.10.100:2100/%3a/");
        
        System.out.println("schema::"+up.getProtocol());
        System.out.println("schema::"+up.getUserInfo());
        System.out.println("schema::"+up.getHost());
        System.out.println("schema::"+up.getPort());
        System.out.println("schema::"+up.getPath());
        System.out.println("schema::"+up.getRef());
        System.out.println("schema::"+up.getQuery());
        
        
    }
        catch(Exception e){
            System.out.println("Try again error handled");
        }
    
}
}
