
package np.edu.scst.socketprogramming;

import java.net.*;
import java.io.*;

public class SocketInfo{ 
    public static void main(String[]args){
        for(String host:args){
            try{
                Socket thesocket=new Socket(host,80);
System.out.println("connected to"+thesocket.getInetAddress()+"on port"
+thesocket.getPort()+"from port"+thesocket.getLocalAddress()+"on port"+
thesocket.getLocalPort());
            }catch(UnknownHostException ex){
System.err.println("can't find"+ host);
        }catch(SocketException ex){
System.err.println("couldnot connect"+ ex);
}catch(IOException ex){
System.out.println(ex);
}
    }
}
}