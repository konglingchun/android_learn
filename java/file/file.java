import java.io.*;

public class file
{

	public static void main(String arg[])
	{
		File f = new File("./tt");

		if(f.exists())
		{
			f.delete();
		}
		else
		{
			try
			{
				f.createNewFile();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

