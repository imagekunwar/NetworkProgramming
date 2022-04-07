
package np.scst.socket.chat.application;

import java.net.*;
import java.io.*;

public class MulticastSender {
    public static void main(String[]args) throws Exception{
        
        InetAddress group=InetAddress.getByName("255.4.5.6");
        
        MulticastSocket multicastSoc=new MulticastSocket();
        
        String msg="Hello this is multicast program";
        
        DatagramPacket outPacket= new DatagramPacket(msg.getBytes(),msg.length(),group,3456);
        
        multicastSoc.send(outPacket);
        multicastSoc.close();
        
        
    }
}
