package com.capgemini.palindrome;

import java.util.Scanner;

public class UserInt {

	static String userInput() {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		return text;
	}
	
	static boolean askIfContinue() {
		String userAnswer;
		System.out.println("Chcesz spróbować ponownie? (t/n)");
		userAnswer = userInput();
		if (userAnswer.equals("n")) {
			return false;
		} else if (userAnswer.equals("t")) {
			return true;
		} else {
			System.out.println("Błędne wprowadzenie. Wybierz t lub n!");
		}
	return askIfContinue();
	}
	
}