
package np.edu.scst.socketprogramming;
import java.net.*;
import java.io.*;
import java.util.Date;// stores day time value in milliseconds.

public class DayTimeServer {
            public final static int PORT=1100;
    public static void main(String[]args) throws IOException{
        try(ServerSocket server=new ServerSocket(PORT)){
            while(true)//invoke the accept method repeatedly
            {           Socket Connection=server.accept();
                        Writer out=new OutputStreamWriter(Connection.getOutputStream());
                        Date now=new Date();//provide current time
                        out.write(now.toString()+"\n\r");// constant display writing string  representation
                        out.flush();
                        Connection.close();
                        
                    }
        } 

    }
    
}
