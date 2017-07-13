package com.capgemini.palindrome;

public class PalindromeMain {

	public static void main (String[] args){
		do {
			System.out.print("Podaj tekst, który chciałbyś sprawdzić: ");
			try {
				PalindromeCheck.checkIfPalindrome(UserInt.userInput());			
			} catch(WrongInputException e) {
				e.getMessage();
			}
		} while(UserInt.askIfContinue());
	}
	
}