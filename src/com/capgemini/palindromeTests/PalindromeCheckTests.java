package com.capgemini.palindromeTests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.capgemini.palindrome.PalindromeCheck;
import com.capgemini.palindrome.WrongInputException;

public class PalindromeCheckTests {

	@Test
	public void shouldBePalindromeNoSpecialSigns() {
		//given
		String text = "kobyłamamałybok";
		
		//when
		
		//then
		assertEquals(true, PalindromeCheck.checkIfPalindrome(text));
	}

	@Test
	public void shouldNotBePalindromeNoSpecialSigns() {
		//given
		String text = "kljkgfyds";
		
		//when
		
		//then
		assertEquals(false, PalindromeCheck.checkIfPalindrome(text));
	}
	
	@Test
	public void shouldBePalindromeWithSpecialSigns() {
		//given
		String text = "87986 Kobyła ma MA 7987 99 ły bO0k *(&*&^ 876765";
		
		//when
		
		//then
		assertEquals(true, PalindromeCheck.checkIfPalindrome(text));
	}

	@Test
	public void shouldNotBePalindromeWithSpecialSigns() {
		//given
		String text = "  ** 787 @#!! kljkgfy87986 ds )**(   ";
		
		//when
		
		//then
		assertEquals(false, PalindromeCheck.checkIfPalindrome(text));
	}
	
	@Test (expected = WrongInputException.class)
	public void shouldThrowAnExceptionSpecialSignsOnly() {
		//given
		String text = "  ** 787 @#!! ##87986 $$ )**(   ";
		
		//when
		
		//then
		assertEquals(WrongInputException.class, PalindromeCheck.checkIfPalindrome(text));
	}
	
	@Test (expected = WrongInputException.class)
	public void shouldThrowAnExceptionEmptyString() {
		//given
		String text = "";
		
		//when
		
		//then
		assertEquals(WrongInputException.class, PalindromeCheck.checkIfPalindrome(text));
	}
	
}
