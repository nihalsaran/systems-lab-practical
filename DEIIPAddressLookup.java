import java.net.InetAddress;
import java.net.UnknownHostException;

public class DEIIPAddressLookup {

    public static void main(String[] args) {
        String hostname = "www.dei.ac.in";

        try {
            // Get the InetAddress object for the specified hostname
            InetAddress address = InetAddress.getByName(hostname);
            
            // Display the IP address of www.dei.ac.in
            System.out.println("IP Address of " + hostname + ": " + address.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Could not resolve the host: " + hostname);
        }
    }
}