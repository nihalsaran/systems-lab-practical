import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner; 

public class InetAddressLookup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a hostname or IP address
        System.out.print("Enter a hostname or IP address: ");
        String input = scanner.nextLine();
        
        try {
            // Get the InetAddress object for the provided hostname or IP
            InetAddress address = InetAddress.getByName(input);
            
            // Display basic information about the address
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            System.out.println("Host Address (IP): " + address.getHostAddress());
            
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve the host: " + input);
        } finally {
            scanner.close();
        }
    }
}