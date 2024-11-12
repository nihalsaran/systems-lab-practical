import java.net.*;
import java.io.*;

public class TCPEchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket welcomeSocket = new ServerSocket(60000);
        System.out.println("Server Started");

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            System.out.println("Connected to a new client");
            new ClientHandler(connectionSocket).start();
        }
    }
}

class ClientHandler extends Thread {
    private static int clientCount = 0;
    private Socket connectionSocket;
    private String clientName;

    public ClientHandler(Socket socket) {
        this.connectionSocket = socket;
        this.clientName = "Client-" + (++clientCount);
    }

    public void run() {
        try {
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            outToClient.writeBytes("You are Connected to " + clientName + "\n");

            String clientSentence;
            String capSentence;

            while ((clientSentence = inFromClient.readLine()) != null) {
                capSentence = clientSentence.toUpperCase();
                outToClient.writeBytes(capSentence + "\n");
            }

            connectionSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}