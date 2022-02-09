
package networkprogramming;
import.java.net.*;

public class CookiePolicy {
    public boolean shouldAccept(URI uri, Http Cookie Cookie){
        if(Uri.getAuthority().toLowerCase()endsWith(".gov")||
                Cookie.getDomin().toLowerCase().endswith(".gov"){
        return false;
    }
                return true;
    }
    
}
