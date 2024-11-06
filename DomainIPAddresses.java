import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DomainIPAddresses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a domain name
        System.out.print("Enter a domain name: ");
        String domainName = scanner.nextLine();

        try {
            // Get all IP addresses associated with the domain name
            InetAddress[] addresses = InetAddress.getAllByName(domainName);

            // Display each IP address
            System.out.println("IP Addresses mapped to " + domainName + ":");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }

        } catch (UnknownHostException e) {
            System.out.println("Could not resolve the domain: " + domainName);
        } finally {
            scanner.close();
        }
    }
}