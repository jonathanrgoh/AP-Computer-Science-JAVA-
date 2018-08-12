//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString( )
	{
		String output="";
		sort();
		for(int i=0; i<wordRay.length; i++)
		{
			output+= "word " + i + " :: " + wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}