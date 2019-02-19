// this class is to check if our input has phonenubmer or not
import java.util.regex.*;
import java.io.*;
public class CheckPhonenumber implements CheckRegex
{
	private String data;
	private String string;
	public CheckPhonenumber(String data, String string)
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
				// some work yet to be done

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