import java.net.InetAddress;
public class NetworkProgramming {

    public static void main(String[] args) {
         try {
        
                InetAddress addr= InetAddress.getLocalHost();
                 System.out.println("localHost Address:" + addr.getHostAddress());
              System.out.println(addr);
         }catch (Exception e){
             System.out.println(e.toString());
         }
        
             
    }
    
}
