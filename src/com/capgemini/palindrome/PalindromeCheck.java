package com.capgemini.palindrome;

public class PalindromeCheck {
	
	private static boolean isPalindrome (String text){
		
		if (text.length() <= 1){
			return true;
		}
		
		if (text.charAt(0) != text.charAt(text.length()-1)){
			return false;
		}
		
		return isPalindrome(text.substring(1, text.length()-1));
	}
	
	public static boolean checkIfPalindrome(String text){
			text = TextValidation.simpleText(text);
		
			if (TextValidation.isTextEmpty(text)) {
				throw new WrongInputException("Nie wprowadzono żadnego tekstu lub wprowadzono ciąg znaków bez liter.");
			} else if (isPalindrome(text)){
				System.out.println("Tak, " + text + " jest palindromem!");
				return true;
			} else {
				System.out.println("Nie, " + text + " nie jest palindromem!");
				return false;
			}
	}
	
}
