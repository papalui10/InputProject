package controller;

import java.util.Scanner;

public class Controller
{
	public void start()
	{
		System.out.println("Words get printed below");
		System.out.print("more words ");
		System.out.println("Even more words");
		
		questions();
		
		moreInput();
	}
	
	private void questions()
	{
		System.out.println("What is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("what is the answer????");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("What is the best type of food?");
		answer = inputScanner.next();
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);
		
		inputScanner = new Scanner(System.in);
		
		System.out.println("Who is the farest of them all?");
		answer = inputScanner.nextLine();
			
		System.out.println("Why am I so sad?");
		answer = inputScanner.next();
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);
		
//		inputScanner.close();
		//Closed because I am still using the InputStream from the keyboard and don't want errors.
	}
	
	private void moreInput()
	{

	
		Scanner textScanner; //This is a declaration of a Scanner variable.
		
		textScanner = new Scanner(System.in); //Initialization of the textScanner variable.
		
		
		System.out.println("Type in your favorite number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite number is: " + userNumber);
		
		textScanner = new Scanner(System.in);
		
		System.out.println("Type in some more information");
		//Need to call .nextLine() to consume the enter press after the call to .next, .nextInt, or .nextDouble
		
		textScanner.nextLine();
		
		textScanner.close();
		
	}

	public boolean validInt(String sample)
	{
		boolean isValid = false;
	
		try
		{
			Integer.parseInt(sample);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("You need to type in a number mammal!");
		}
		return isValid;
	}
	
}


