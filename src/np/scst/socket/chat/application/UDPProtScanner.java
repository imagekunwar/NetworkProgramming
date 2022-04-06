
package np.scst.socket.chat.application;
import java.io.IOException;
import java.net.DatagramSocket;

public class UDPProtScanner {

public static void main(String[]args){
  for(int port=1024; port<=65535; port++);
    try{
    DatagramSocket socket=new DatagramSocket(port);
}    
    catch(IOException ex){
        System.out.println("Ther is server on port"+port);
    }
}
}
