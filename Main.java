
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
				switch(str1)
				{
					case "-Phone":
						try
						{
							CheckPhonenumber checkphonenumber = new CheckPhonenumber(str2, str3);
							checkphonenumber.Check();
						}

				}

			}


	}

}