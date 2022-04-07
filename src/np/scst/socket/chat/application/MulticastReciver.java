
package np.scst.socket.chat.application;

import java.io.*;
import java.net.*;

public class MulticastReciver {
    public static void main(String[]args) throws Exception{

InetAddress group= InetAddress.getByName("255.4.5.6");
MulticastSocket multicastSocket=new MulticastSocket(3456);
byte[] buffer=new byte[256];

DatagramPacket inPacket=new DatagramPacket(buffer, buffer.length);

multicastSocket.receive(inPacket);

System.out.println(new String(buffer));
multicastSocket.close();
        
        
        
    }
    
}
