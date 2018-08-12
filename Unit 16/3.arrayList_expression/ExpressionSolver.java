//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	//add in instance variables
	ArrayList <String> expression;
	String exp;
	int solution;

	public ExpressionSolver(String s)
	{
		setExpression(s);
	}

	public void setExpression(String s)
	{
		exp = s;
		expression = new ArrayList<String>();
		Scanner chopper = new Scanner(exp);
		while(chopper.hasNext())
		{
			expression.add(chopper.next());
		}

	}

	public void solveExpression()
	{
		solution = 0;
		int temporary = 0;

		while(expression.indexOf("*")>=0||expression.indexOf("/")>=0)
		{
			if(expression.indexOf("*")>=0&&expression.indexOf("*")<expression.indexOf("/")||expression.indexOf("/")==-1)
			{
				int t = expression.indexOf("*");
				temporary = Integer.parseInt(expression.get(t-1))*Integer.parseInt(expression.get(t+1));
				expression.set(t+1,""+temporary);
				expression.remove(t);
				expression.remove(t-1);
			}

			else if(expression.indexOf("/")>=0&&expression.indexOf("/")<expression.indexOf("*")||expression.indexOf("*")==-1)
			{
				int t = expression.indexOf("/");
				temporary = Integer.parseInt(expression.get(t-1))/Integer.parseInt(expression.get(t+1));
				expression.set(t+1,""+temporary);
				expression.remove(t);
				expression.remove(t-1);
			}
		}

		while(expression.indexOf("+")>=0||expression.indexOf("-")>=0)
		{
			if(expression.indexOf("+")>=0&&expression.indexOf("+")<expression.indexOf("-")||expression.indexOf("-")==-1)
			{
				int t = expression.indexOf("+");
				temporary = Integer.parseInt(expression.get(t-1))+Integer.parseInt(expression.get(t+1));
				expression.set(t+1,""+temporary);
				expression.remove(t);
				expression.remove(t-1);
			}

			else if(expression.indexOf("-")>=0&&expression.indexOf("-")<expression.indexOf("+")||expression.indexOf("+")==-1)
			{
				int t = expression.indexOf("-");
				temporary = Integer.parseInt(expression.get(t-1))-Integer.parseInt(expression.get(t+1));
				expression.set(t+1,""+temporary);
				expression.remove(t);
				expression.remove(t-1);
			}
		}
		solution = Integer.parseInt(expression.get(0));
	}

	public String toString( )
	{
		String output = exp;
		solveExpression();
		output+= " = " + solution;
		return output;
	}
}