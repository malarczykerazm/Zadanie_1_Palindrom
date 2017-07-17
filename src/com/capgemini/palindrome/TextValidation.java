package com.capgemini.palindrome;

/**
 * validates the input
 * @author EMALARCZ
 *
 */
public class TextValidation {
	
	/**
	 * replace all the special signs and spaces with empty Strings, lowercases the input
	 * @param text
	 * @return String (preprocessed text)
	 */
	static String simpleText(String text) {
		text = text.replaceAll(" ", "");
		text = text.toLowerCase();
		text = text.replaceAll("[^a-z, ą, ć, ę, ł, ń, ó, ś, ź, ż]", "");
		return text;
	}
	
	/**
	 * checks if the input is an empty String
	 * @param text
	 * @return boolean (true for an empty String, false otherwise)
	 */
	static boolean isTextEmpty(String text) {
		if (text.length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
