//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;

	public MadLib()
	{
		loadNouns();
		loadVerbs();
		loadAdjectives();



	}

	public MadLib(String fileName)
	{
		//load stuff

		try
		{
			Scanner file = new Scanner(new File(fileName));

		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner file = new Scanner(new File("nouns.dat"));
			nouns = new ArrayList<String>();
			while(file.hasNext())
			{
				nouns.add(file.next());
				file.nextLine();
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner file = new Scanner(new File("verbs.dat"));
			verbs = new ArrayList<String>();
			while(file.hasNext())
			{
				verbs.add(file.next());
				file.nextLine();
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner file = new Scanner(new File("adjectives.dat"));
			adjectives = new ArrayList<String>();
			while(file.hasNext())
			{
				adjectives.add(file.next());
				file.nextLine();
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		int r = (int)(Math.random()*verbs.size());
		return verbs.get(r);
	}

	public String getRandomNoun()
	{
		int r = (int)(Math.random()*nouns.size());
		return nouns.get(r);
	}

	public String getRandomAdjective()
	{
		int r = (int)(Math.random()*adjectives.size());
		return adjectives.get(r);
	}

	public String toString()
	{

		String output= " ";
		try
		{
			Scanner file = new Scanner(new File("story.dat"));
			while(file.hasNext())
			{
				String s = file.next();
				if(s.equals("#"))
				{
					s = getRandomNoun();
				}
				else if(s.equals("@"))
				{
					s = getRandomVerb();
				}
				else if(s.equals("&"))
				{
					s = getRandomAdjective();
				}
				output += s + " ";
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	   return output + "\n\n\n";
	}
}