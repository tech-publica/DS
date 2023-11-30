package decorator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String test ="jjkklloosz";
		Pattern p = Pattern.compile("..");
		Matcher mat = p.matcher(test);
		while(mat.find())
			System.out.println(mat.group());

	}

}
