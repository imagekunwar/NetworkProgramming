
package networkprogramming;
import java.io.*;
import java.net.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class AllHeaders {
    public static void main(String[]args) throws MalformedURLException, IOException{
        //for (int i=0;i<args.length;i++)
        
        URL U=new URL("http://scst.edu.np/uploads/content_image/BCA_Course_Structure.png");
        URLConnection uc=U.openConnection();
        
        for(int j=1; ;j++){
            String header= uc.getHeaderField(j);
            if(header==null){
                break;
        }   
            System.out.println(uc.getHeaderField(j) +":"+ header);
        
    }
    }
    
}
