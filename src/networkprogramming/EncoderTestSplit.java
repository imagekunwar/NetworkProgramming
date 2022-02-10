
package networkprogramming;
import java.io.*;

import java.net.*;

public class EncoderTestSplit {

public static void main(String[] args)throws Exception {​​​​​


    String url = URLEncoder.encode "https://www.google.com/search?" ;

    url += URLEncoder.encode("hl", "UTF-8");

    url += "=";

    url += URLEncoder.encode("en", "UTF-8");

    url += "&";

    url += URLEncoder.encode("as_q", "UTF-8");

    url += "=";

    url += URLEncoder.encode("Java", "UTF-8");

    url += "&";

    url += URLEncoder.encode("as_epq", "UTF-8");

    url +=  "=";

    url += URLEncoder.encode("I/O", "UTF-8");

    System.out.println(url);

}​​​
}


    

