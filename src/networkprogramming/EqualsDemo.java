
package networkprogramming;
import java.net.URL;

public class EqualsDemo {
    public static void main(String[]args){
        try{
            URL u1= new URL("http://www.example.com");
            URL u2=new URL("http://example.com");   
            if(u1.equals(u2)){
                System.out.println(u1+"equals"+u2);
            }
            else{
                System.out.println(u1+"not equals"+u2);
            }
            
        }
        catch(Exception e){
            System.out.println("Exception is handled"+ e);
        }
    }
    
}
