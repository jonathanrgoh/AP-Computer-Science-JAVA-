//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FancyWordsRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("fancywords.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			FancyWords test = new FancyWords(file.nextLine());
			System.out.println(test);
		}
	}
}