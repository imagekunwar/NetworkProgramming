
package np.scst.socket.chat.application;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientSide {
    public static void main(String[]args) throws IOException {
        
        Socket s=new Socket("localhost",7080);
        
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String str="",str2="";
                while(!str.equals("stop")){
        System.out.println("\n Enter Response");
        str=br.readLine();
        dout.writeUTF(str);
        dout.flush();
        System.out.print("server says:" +str2);
        
    }
                dout.close();
                s.close();
 
    }
}
