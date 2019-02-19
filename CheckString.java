import java.util.regex.*;
public class  CheckString implements CheckRegex
{
	private String data;
	private String string;
	public CheckString(String data, String string)
	{
		this.data = data;
		this.string = string;
	}
	
	@Override
	public void Check()
	{
		try
		{
			FileReader filereader = new FileReader(string);
			BufferedReader breader = new BufferedReader(filereader);
			Pattern pattern = Pattern.compile(data);
			String line;
			while((line = breader.readLine())!=null)
			{
				Matcher m = pattern.matcher(line);
				if(m.find())
					System.out.println(line);

			}
			breader.close();
			filereader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Usage usage = new Usage();
		}

	}



}