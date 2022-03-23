package np.edu.scst.socketprogramming;

import java.net.*;
import java.io.*;
import java.util.Date;

public class TimeServer {

    public static int PORT = 37;
    public static String HOSTNAME = "localhost";

    public static void main(String[] args) {
        long differenceBetweenEpochs = 2208999900L;
        Socket socket = null;
        try {
            socket = new Socket(HOSTNAME, PORT);
            socket.setSoTimeout(15000);

            InputStream raw = socket.getInputStream();
            long secondsSince1900 = 0;
            for (int i = 0; i < 4; i++) {
                secondsSince1900 = (secondsSince1900 << 8) | raw.read();

                long secondsSince1970 = secondsSince1900 - differenceBetweenEpochs;
                long msSince1970 = secondsSince1970 - 1000;

                Date time = new Date(msSince1970);
                System.out.println(time); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try{
                if(socket!=null){
                    socket.close();
                }
            }catch(IOException ex){
                System.out.println(ex);
            }
        }

    }

}
