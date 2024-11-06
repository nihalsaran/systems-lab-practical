import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPToHostname {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an IP address
        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        try {
            // Get the InetAddress object for the specified IP address
            InetAddress address = InetAddress.getByName(ipAddress);

            // Display the hostname associated with the IP address
            System.out.println("Hostname for IP address " + ipAddress + ": " + address.getHostName());

        } catch (UnknownHostException e) {
            System.out.println("Could not resolve the IP address: " + ipAddress);
        } finally {
            scanner.close();
        }
    }
}