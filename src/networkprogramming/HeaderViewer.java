
package networkprogramming;
import java.util.*;
import java.io.*;
import java.net.*;


public class HeaderViewer {
    public static void main(String[] args) throws MalformedURLException, IOException {

        URL u = new URL("http://scst.edu.np/academics/computer-application/introduction");
        URLConnection uc = u.openConnection();
        System.out.println("Content-type " + uc.getContentType());
        System.out.println("Content Encoding " + uc.getContentEncoding());
        System.out.println("Content length " + uc.getContentLength());
        System.out.println("Content Date " + uc.getDate());
        System.out.println("Content Last Modified " + uc.getLastModified());

    }

    
}
