
package networkprogramming;
import java.net.InetAddress;

public class IP {
     public static void main(String[] args) {
        try {

            InetAddress addr = InetAddress.getLocalHost();

            System.out.println("Host Address:  " + addr.getHostAddress());
            System.out.println("Host Name: " + addr.getHostName());

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
        
        
        
        
        
    }
