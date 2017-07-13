package com.capgemini.palindrome;

public class TextValidation {
	
	static String simpleText(String text) {
		text = text.replaceAll(" ", "");
		text = text.toLowerCase();
		text = text.replaceAll("[^a-z, ą, ć, ę, ł, ń, ó, ś, ź, ż]", "");
		return text;
	}
	
	static boolean isTextEmpty(String text) {
		if (text.length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
