import java.net.*;
import java.io.*;

class Server
{
public static void main(String args[])throws Exception
{

ServerSocket ss=new ServerSocket(5555);
System.out.println("Server Started......");

System.out.println("Wating for the Client......");

Socket sc=ss.accept();

System.out.println("Client Connected... Ready To Chat..@@@@@@@@");


DataInputStream dis=new DataInputStream(sc.getInputStream());
DataOutputStream dos=new DataOutputStream(sc.getOutputStream());

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String msgFclient="";
String msgFserver="";

while(!(msgFserver.equals(null)))
{

msgFserver=br.readLine();

dos.writeUTF(msgFserver);

msgFclient=dis.readUTF();

System.out.println("From Client  : -"+msgFclient);

}

}
}
