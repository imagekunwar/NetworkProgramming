
package np.scst.socket.chat.application;
import java.io.*;
import java.net.*;

public class UDPClient {
public static void main(String[]args) throws Exception{
    /*create a buffer for incoming datagram*/
    BufferedReader inFromClient=new BufferedReader(new InputStreamReader(System.in));
    
    DatagramSocket clientSocket=new DatagramSocket();
    InetAddress serverAddress=InetAddress.getByName("hostname");
    
    byte[]sendData=new byte[1024];
    byte[]receiveData=new byte[1024]; 
    
    String message= inFromClient.readLine();
    sendData =message.getBytes();
    
    DatagramPacket outPacket=new DatagramPacket(sendData,sendData.length,serverAddress,1234);
    clientSocket.send(outPacket);
    
    DatagramPacket inPacket=new DatagramPacket(receiveData, receiveData.length);
    clientSocket.receive(inPacket);
    
    String modifiedSentence=new String(inPacket.getData());
    
    System.out.println("From Server:"+ modifiedSentence);
    clientSocket.close();

}    
}
