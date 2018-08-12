//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factors;
		factors = new ArrayList<Integer>();

		for (int i=2; i<number; i++)
		{
			if (number%i==0)
			{
				factors.add(i);
			}
		}

		return factors;
	}

	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
		for (int j=0; j<nums.size(); j++)
		{
			int count = 0;
			for (int k=2; k<nums.get(j); k++)
			{
				if (nums.get(j)%k==0)
				{
					count++;
				}
			}

				if (count==0)
				{
					nums.remove(j);
				}
		}
	}
}