package ddc;


/**
* ddc/TFileOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DDC.idl
* 2019��3��29�� ������ ����12ʱ39��02�� CST
*/

public interface TFileOperations 
{
  void download (String fileName, ddc.DataHolder bytes) throws ddc.UnknownException;
} // interface TFileOperations
