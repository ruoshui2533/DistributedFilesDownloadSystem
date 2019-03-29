package ddc;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import java.util.Properties;
import java.io.*;
public class Client {
public static void main(String[] args) throws UnknownException
{
try{
Properties env = new Properties();
env.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
env.setProperty("org.omg.CORBA.ORBInitialPort", "1050");
ORB orb = ORB.init(args, env);
org.omg.CORBA.Object temp;
temp = orb.resolve_initial_references("NameService");
NamingContextExt node = NamingContextExtHelper.narrow(temp);
temp = node.resolve_str("TFile");
TFile ro = TFileHelper.narrow(temp);
DataHolder result = new DataHolder();
String fileName="c:\\qinjun.jpg";
ro.download(fileName, result);
System.out.println(result.value.length);
FileOutputStream fos=new FileOutputStream("c:\\qinjunex.jpg");
fos.write(result.value);
fos.flush();
fos.close();
}catch(Exception ex){}
}
}
