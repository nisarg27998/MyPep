import java.io.*;
import java.net.*;

class Client
{
public static void main(String args[])throws Exception
{

Socket sc=new Socket("localhost",5555);
System.out.println("Client Started @@@ And Connected With Server   $$$$$");

DataInputStream dis=new DataInputStream(sc.getInputStream());
DataOutputStream dos=new DataOutputStream(sc.getOutputStream());

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String msgFclient="";
String msgFserver="";

while(true)
{
msgFserver=dis.readUTF();

System.out.println("From Server  : -"+msgFserver);

msgFclient=br.readLine();
dos.writeUTF(msgFclient);


}
}
} 