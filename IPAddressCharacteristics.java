import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressCharacteristics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an IP address
        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        try {
            // Get the InetAddress object for the specified IP address
            InetAddress address = InetAddress.getByName(ipAddress);

            // Display IP address and its characteristics
            System.out.println("IP Address: " + address.getHostAddress());
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
            System.out.println("Is Loopback Address: " + address.isLoopbackAddress());
            System.out.println("Is Link Local Address: " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address: " + address.isSiteLocalAddress());
            System.out.println("Is Multicast Address: " + address.isMulticastAddress());
            System.out.println("Is Global Multicast: " + address.isMCGlobal());
            System.out.println("Is Node-Local Multicast: " + address.isMCNodeLocal());
            System.out.println("Is Link-Local Multicast: " + address.isMCLinkLocal());
            System.out.println("Is Site-Local Multicast: " + address.isMCSiteLocal());
            System.out.println("Is Organization-Local Multicast: " + address.isMCOrgLocal());

        } catch (UnknownHostException e) {
            System.out.println("Could not resolve the IP address: " + ipAddress);
        } finally {
            scanner.close();
        }
    }
}