
package np.scst.socket.chat.application;

import java.net.*;
import java.io.*;


public class ServerSide {
    public static void main(String[]args) throws IOException{
        ServerSocket ss=new ServerSocket(7080);
        Socket s=ss.accept();
        
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String str="", str2="";
        while(str!="stop"){
            str=din.readUTF();
            System.out.println("client"+str);
            System.out.println("Enter message");
            str2=br.readLine();
            dout.writeUTF(str2);
            
        }
        dout.flush();
        din.close();
        s.close();
        ss.close();
    }
}
