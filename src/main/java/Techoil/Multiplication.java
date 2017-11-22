package Techoil;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNumber,multiply;
	
		
		Scanner scan = new Scanner(System.in);
		inputNumber = scan.nextInt();
		
		for(int i=1;i<=20;i++)
		{
			multiply= inputNumber*i;
			System.out.println(multiply);
		}

	}

}
