
package networkprogramming;
import java.net.*;

public class ResourceCheck {
    public static void main(String[]args){
        try{
        URL u1=new URL("http://www.example.com/HTMLPrimer.html#GS");
        URL u2=new URL("http://www.exmaple.com/HTMLPrimer.html#GS");
        
        if(u1.sameFile(u2)){
            System.out.println("Both URL are same");
        }
        else{
            System.out.println("Both URL are not same");
        }   
        
    }
        catch(Exception e){
            System.out.println("Exception is handled"+e);
        }
    }
    
        

