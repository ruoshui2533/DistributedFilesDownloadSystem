package ddc;
import java.io.*;
public class TFileImpl extends TFilePOA
{
	public byte[] getData(String fileName) throws Exception
	{
		byte[] fdata=null;
		int n;
		if(!fileName.equalsIgnoreCase("c:\\qinjun.jpg")) throw new UnknownException("File name is not correct");
		FileInputStream fis = new FileInputStream(fileName);
		n=fis.available();
		fdata=new byte[n];
		fis.read(fdata);
		return fdata;
	}
	@Override
	public void download(String fileName, DataHolder bytes)
			throws UnknownException {
		// TODO Auto-generated method stub
		try
		{
			bytes.value=this.getData(fileName);
		}catch(Exception ex){ex.printStackTrace();}
		
	}

}
