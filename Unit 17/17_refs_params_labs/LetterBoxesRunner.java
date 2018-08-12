//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("\nEnter the letter for the box :: ");
			char letter = keyboard.next()0.charAt(0);

			out.print("Enter the size of the box :: ");
 			int size = keyboard.nextInt();

			LetterBoxes test = new LetterBoxes();
			test.printBox(letter,size);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}