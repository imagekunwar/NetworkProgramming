
package np.scst.socket.chat.application;
import java.io.*;
import java.net.*;

public class UDPServer {
    public static void main (String[]args) throws Exception{
        DatagramSocket serverSocket=new DatagramSocket(1234);
        byte[]receiveData=new byte[1024];
        byte[] sendData=new byte[1024];
        
        while(true){
            DatagramPacket inPacket=new DatagramPacket( receiveData,receiveData.length);
            serverSocket.receive(inPacket);
            
            String message= new String(inPacket.getData());
            InetAddress clientAddress=inPacket.getAddress();
            int clientPort=inPacket.getPort();
            
            DatagramPacket outPacket=new DatagramPacket(sendData,sendData.length,clientAddress,clientPort);
            serverSocket.send(outPacket);
            serverSocket.close();
            
            
        }
        
    }
    
}
