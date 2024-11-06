import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalMachineAddress {

    public static void main(String[] args) {
        try {
            // Get the InetAddress object for the local host
            InetAddress localAddress = InetAddress.getLocalHost();
            
            // Display the IP address and hostname of the local machine
            System.out.println("Local Machine Name: " + localAddress.getHostName());
            System.out.println("Local Machine IP Address: " + localAddress.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Could not determine the local machine address.");
        }
    }
}