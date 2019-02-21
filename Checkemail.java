import java.util.regex.*;
import java.io.*;
public class Checkemail implements CheckRegex
{
	private String filename;
	public Checkemail(String filename)
	{
		this.filename = filename;
	}

	@Override
	public void Check()
	{
		try
		{
			FileReader filereader = new FileReader(filename);
			BufferedReader breader = new BufferedReader(filereader);
			Pattern pattern = Pattern.compile("HAHA");
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