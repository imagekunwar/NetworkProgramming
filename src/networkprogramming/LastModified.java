
package networkprogramming;
import java.io.*;
import java.util.*;
import java.net.*;

public class LastModified {
    public static void main(String[]args){
        for(int i=0; i<args.length;i++){
            try{
                URL u=new URL(args[i]);
                HttpURLConnection http=(HttpURLConnection)u.openConnection();
                http.setRequestMethod("HEAD");
                System.out.println(u+"was last modified at"
                        +new Date(http.getLastModified()));
                
            }
            catch(MalformedURLException e){
                System.out.println(args[i]+"is not a URL");
            }
            catch(IOException ex){
                System.out.println(ex);
            }
            System.out.println();
        }
    }
    
}
