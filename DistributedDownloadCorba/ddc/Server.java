package ddc;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NameComponent;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import java.util.Properties;
public class Server {
public static void main(String[] args)
{
try{
Properties env = new Properties();
env.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
env.setProperty("org.omg.CORBA.ORBInitialPort", "1050");
ORB orb = ORB.init(args, env);
org.omg.CORBA.Object temp;
temp = orb.resolve_initial_references("RootPOA");
POA poa = POAHelper.narrow(temp);
poa.the_POAManager().activate();
TFileImpl servant = new TFileImpl();
temp = poa.servant_to_reference(servant);
TFile ro = TFileHelper.narrow(temp);
temp = orb.resolve_initial_references("NameService");
NamingContextExt node = NamingContextExtHelper.narrow(temp);
NameComponent[] path = node.to_name("TFile");
node.rebind(path, ro);
System.out.println("Server is running.......");
orb.run();
}catch(Exception ex){}
}
}
