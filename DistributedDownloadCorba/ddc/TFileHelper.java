package ddc;


/**
* ddc/TFileHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DDC.idl
* 2019年3月29日 星期五 下午12时39分02秒 CST
*/

abstract public class TFileHelper
{
  private static String  _id = "IDL:ddc/TFile:1.0";

  public static void insert (org.omg.CORBA.Any a, ddc.TFile that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ddc.TFile extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ddc.TFileHelper.id (), "TFile");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ddc.TFile read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TFileStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ddc.TFile value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ddc.TFile narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ddc.TFile)
      return (ddc.TFile)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ddc._TFileStub stub = new ddc._TFileStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ddc.TFile unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ddc.TFile)
      return (ddc.TFile)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ddc._TFileStub stub = new ddc._TFileStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
