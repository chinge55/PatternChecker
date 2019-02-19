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
		Pattern p = Pattern.compile(data);
		Matcher m = p.matcher(string);
		System.out.println("The data is in :");
		while(m.find())
		{
			System.out.println("index "+m.start()+" to "+m.end());
		}


	}

}