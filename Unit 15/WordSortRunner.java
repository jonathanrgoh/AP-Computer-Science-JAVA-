//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*;

public class WordSortRunner
{
	public static void main(String args[])
	{
		//add test cases
		String l = "abc ABC 12321 fred alexander";
		WordSort test =  new WordSort(l);
		System.out.println(test + "\n");

		l = "a zebra friendly acrobatics 435 TONER PRinTeR";
		test.setList(l);
		System.out.println(test + "\n");

		l = "b x 4 r s y $";
		test.setList(l);
		System.out.println(test + "\n");

		l = "123 ABC abc 034 dog cat sally sue bob 2a2";
		test.setList(l);
		System.out.println(test + "\n");

	}
}