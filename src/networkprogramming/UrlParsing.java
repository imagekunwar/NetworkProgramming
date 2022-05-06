
package networkprogramming;
import java.net.URL;
public class UrlParsing {
    public static void main(String[]args){
        try{
        URL up =new URL("ftp://mp3:mp3@192.168.10.100:2100/%3a/");
        
        System.out.println("protocol::"+up.getProtocol());
        System.out.println("UserInfo::"+up.getUserInfo());
        System.out.println("Host::"+up.getHost());
        System.out.println("Port::"+up.getPort());
        System.out.println("Path::"+up.getPath());
        System.out.println("Refrence::"+up.getRef());
        System.out.println("Query::"+up.getQuery());
        
        
    }
        catch(Exception e){
            System.out.println("Try again error handled");
        }
    
}
}
