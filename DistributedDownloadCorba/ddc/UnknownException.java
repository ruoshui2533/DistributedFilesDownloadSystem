package ddc;


/**
* ddc/UnknownException.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DDC.idl
* 2019��3��29�� ������ ����12ʱ39��02�� CST
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
