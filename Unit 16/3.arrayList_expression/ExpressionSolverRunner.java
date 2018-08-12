//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
		String l = "3 + 5";
		ExpressionSolver test =  new ExpressionSolver(l);
		System.out.println(test + "\n");

		l = "3 * 5";
		test.setExpression(l);
		System.out.println(test + "\n");

		l = "3 - 5";
		test.setExpression(l);
		System.out.println(test + "\n");

		l = "3 / 5";
		test.setExpression(l);
		System.out.println(test + "\n");

		l = "5 / 5 * 2 + 8 / 2 + 5";
		test.setExpression(l);
		System.out.println(test + "\n");

		l = "5 * 5 + 2 / 2 - 8 + 5 * 5 - 2";
		test.setExpression(l);
		System.out.println(test + "\n");

	}
}