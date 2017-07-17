package com.capgemini.palindrome;

import java.util.Scanner;

/**
 * user interface
 * @author EMALARCZ
 *
 */
public class UserInt {

	/**
	 * gets user's input
	 * @return String input
	 */
	static String userInput() {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		return text;
	}
	
	/**
	 * asks the user if the application should keep going
	 * @return boolean (true for terminate, false otherwise)
	 */
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