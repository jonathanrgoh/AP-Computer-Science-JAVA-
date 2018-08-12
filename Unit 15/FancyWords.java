//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;

		for(int i=0; i<wordRay.length; i++)
		{
			if(wordRay[i].length()>max)
			{
				max = wordRay[i].length();
			}
		}

		for(int j=0; j<max; j++)
		{
			for(int k=wordRay.length-1; k>=0; k--)
			{
				if(wordRay[k].length()-(1+j)>=0)
				{
					output+=wordRay[k].charAt(wordRay[k].length()-(1+j));
				}
				else
				{
					output+=" ";
				}
			}

			output+="\n";
		}

		return output+"\n\n";
	}
}