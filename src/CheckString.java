import java.util.regex.*;
import java.io.*;
public class CheckString implements CheckRegex
{
	private String filename;
	public CheckString(String filename)
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
			System.out.println("Please Enter The String");
			BufferedReader takeinput = new BufferedReader(new InputStreamReader(System.in));
			String data = takeinput.readLine();
			String line;
			int i=0;
			Pattern pattern = Pattern.compile(data);
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