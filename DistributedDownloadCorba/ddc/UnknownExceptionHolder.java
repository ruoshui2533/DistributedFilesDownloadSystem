package ddc;

/**
* ddc/UnknownExceptionHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DDC.idl
* 2019年3月29日 星期五 下午12时39分02秒 CST
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
