import java.net.*;
import java.io.*;
public class TCPEchoClient {
/**
* @param args the command line arguments
*/
public static void main(String[] args) throws Exception{
// TODO code application logic here
String Sentence;
String modifiedSentence;
BufferedReader inFromUser= new BufferedReader(new InputStreamReader(System.in));
Socket clientSocket= new Socket("localhost",60000);
DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
BufferedReader inFromServer= new BufferedReader(new
InputStreamReader(clientSocket.getInputStream()));
System.out.println("From Server:" + inFromServer.readLine()+ "\n");

try {
while (true){
Sentence= inFromUser.readLine();
outToServer.writeBytes(Sentence + "\n");
modifiedSentence= inFromServer.readLine();
System.out.println("From Server:" + modifiedSentence);
}}
finally{
clientSocket.close();}

}
}