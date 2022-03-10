
package np.edu.scst.socketprogramming;

import java.net.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class LowPortScanner {
    public static void main(String[]args){
        String host=args.length>0? args[0]:"localhost";
        for(int i=1; i<1024; i++){
            try{
                Socket s=new Socket(host,i);
                System.out.println("There is a server on port"+i+"of"+host);
                //s.close();
                s.setSoTimeout(1500);
                s.close();
            }
            catch(UnknownHostException ex){
                System.err.println(ex);
                break;
            }
            catch(IOException ex){
                System.out.println("Exception"+ex);
                
                
            }
        }
    }
}

