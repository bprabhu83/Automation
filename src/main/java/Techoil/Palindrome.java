package Techoil;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNumber,quotient,reminder;
		int sum=0;
	
		
		Scanner scan = new Scanner(System.in);
		inputNumber = scan.nextInt();
		
		
			
		if(inputNumber < 0)
		{
		 inputNumber = inputNumber * -1;
		}

		int originalNumber = inputNumber;
		int reverseNumber =0;
		
		while(inputNumber != 0)
		{
			quotient = inputNumber / 10;
	    reminder = inputNumber % 10;
	    inputNumber = quotient;
		reverseNumber = reverseNumber * 10 + reminder;
	sum= sum + reminder;
		
		}
		
		
		if (originalNumber == reverseNumber)
		{
		
		 System.out.println("OriginalNumber is a palindrome");
		}
		else
		{	
			System.out.println("OriginalNumber is not a palindrome");
			
		}
		
		System.out.println("Addition of number" +sum);
	
		
	}

}
