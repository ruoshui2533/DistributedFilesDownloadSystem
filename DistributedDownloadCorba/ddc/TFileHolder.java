package ddc;

/**
* ddc/TFileHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DDC.idl
* 2019��3��29�� ������ ����12ʱ39��02�� CST
*/

public final class TFileHolder implements org.omg.CORBA.portable.Streamable
{
  public ddc.TFile value = null;

  public TFileHolder ()
  {
  }

  public TFileHolder (ddc.TFile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ddc.TFileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ddc.TFileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ddc.TFileHelper.type ();
  }

}
