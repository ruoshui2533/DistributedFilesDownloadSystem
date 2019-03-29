package ddc;


/**
* ddc/UnknownException.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DDC.idl
* 2019年3月29日 星期五 下午12时39分02秒 CST
*/

public final class UnknownException extends org.omg.CORBA.UserException
{

  public UnknownException ()
  {
    super(UnknownExceptionHelper.id());
  } // ctor


  public UnknownException (String $reason)
  {
    super(UnknownExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class UnknownException
