import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
		/*String str1 = args[0];
			String str2 = args[1];
			CheckString str = new CheckString(str1, str2);
			str.Check();
	*/	
			if(args[0]==null || args[1]==null)
			{
				Usage usage = new Usage();
			}
			else
			{
				String str1 = args[0];
				String str2 = args[1];
				String str3 = args[2];
				BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
				switch(str1)
				{
					case "-Phone":
						try
						{
							CheckPhonenumber checkphonenumber = new CheckPhonenumber(str2);
							checkphonenumber.Check();
						}catch(Exception e)
						{
							e.printStackTrace();
							Usage usage = new Usage();
						}
					case "-String":
						try
						{
							CheckString checkstring = new CheckString(str2, str3);
							checkstring.Check();
						}catch(Exception e)
						{
							e.printStackTrace();
							Usage usage = new Usage();
						}
					/*case "-Email":
						try
						{
							Checkemail checkemail = new Checkemail(str2, str3);
							checkemail.Check();
						}catch(Exception e)
						{
							e.printStackTrace();
							Usage usage = new Usage();
						}*/
					default:
						Usage usage = new Usage();

				}

			}


	}

}