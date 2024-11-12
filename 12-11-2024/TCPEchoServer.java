import java.net.*;
import java.io.*;
public class TCPEchoServer {
/**
* @param args the command line arguments
*/
public static void main(String[] args) throws Exception{
// TODO code application logic here
String clientSentence;
String capSentence;
ServerSocket WelcomeSoc= new ServerSocket(60000);
Socket ConSoc= WelcomeSoc.accept();
System.out.println("Server Started");
BufferedReader inFromClient= new BufferedReader(new
InputStreamReader(ConSoc.getInputStream()));
DataOutputStream outToClient= new DataOutputStream(ConSoc.getOutputStream());
System.out.println("Connected");
outToClient.writeBytes("You are Connected to Echo Server" + "\n");

while (true){
clientSentence= inFromClient.readLine();
capSentence= clientSentence.toUpperCase();
outToClient.writeBytes(capSentence + "\n");
}
}
}