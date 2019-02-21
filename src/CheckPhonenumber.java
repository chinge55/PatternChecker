// this class is to check if our input has phonenubmer or not
import java.util.regex.*;
import java.io.*;
public class CheckPhonenumber implements CheckRegex
{
	private String filename;
	public CheckPhonenumber(String filename)
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
			Pattern pattern = Pattern.compile("(98)([0-9]{8}?)");
			String line;
			int i=0;
			while((line = breader.readLine())!=null)
			{
				i++;
				Matcher m = pattern.matcher(line);
				while(m.find())
				{	
					System.out.println("At Line: "+i+" index "+m.start()+" character:: "+m.group());
				}
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