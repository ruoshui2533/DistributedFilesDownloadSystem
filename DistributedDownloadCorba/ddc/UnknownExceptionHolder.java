package ddc;

/**
* ddc/UnknownExceptionHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DDC.idl
* 2019��3��29�� ������ ����12ʱ39��02�� CST
*/

public final class UnknownExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public ddc.UnknownException value = null;

  public UnknownExceptionHolder ()
  {
  }

  public UnknownExceptionHolder (ddc.UnknownException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ddc.UnknownExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ddc.UnknownExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ddc.UnknownExceptionHelper.type ();
  }

}
