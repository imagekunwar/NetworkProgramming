
package networkprogramming;
import java.net.InetAddress;

public class GoogleAllName {
    

    public static void main(String[] args) {
        String host = "www.google.com";

        try {
            InetAddress[] addr
                    = InetAddress.getAllByName(host);

            for (InetAddress Iaddr : addr) {
                System.out.println(Iaddr.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


    

