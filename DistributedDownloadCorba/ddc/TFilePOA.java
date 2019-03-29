package ddc;


/**
* ddc/TFilePOA.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DDC.idl
* 2019年3月29日 星期五 下午12时39分02秒 CST
*/

public abstract class TFilePOA extends org.omg.PortableServer.Servant
 implements ddc.TFileOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("download", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ddc/TFile/download
       {
         try {
           String fileName = in.read_string ();
           ddc.DataHolder bytes = new ddc.DataHolder ();
           this.download (fileName, bytes);
           out = $rh.createReply();
           ddc.DataHelper.write (out, bytes.value);
         } catch (ddc.UnknownException $ex) {
           out = $rh.createExceptionReply ();
           ddc.UnknownExceptionHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ddc/TFile:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public TFile _this() 
  {
    return TFileHelper.narrow(
    super._this_object());
  }

  public TFile _this(org.omg.CORBA.ORB orb) 
  {
    return TFileHelper.narrow(
    super._this_object(orb));
  }


} // class TFilePOA
