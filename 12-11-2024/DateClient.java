import java.io.*;
import java.net.*;

public class DateClient {
/**
* @param args the command line arguments
*/
public static void main(String args[]) throws Exception
{
try (Socket soc = new Socket(InetAddress.getLocalHost(), 5220);
	 BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()))) {
	System.out.println(in.readLine());
}
}
}
