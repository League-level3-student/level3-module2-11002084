package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringTrimmer {
	
	static public String trimString(String str, int removesLeft) {
		//1. If there are no removes left
		if(removesLeft == 0) {
			//2.  return the string
			return str;
		}
		//3. Else you need to substring the string by 1, reduce removesLeft by 1, and then return both. 
		else {
			return trimString(str.substring(0, str.length()-1), removesLeft-1);
		}
	}
	
	@Test
	public void testTrimString() {
		assertEquals("Hello W", trimString("Hello World!", 5));
		assertEquals("League", trimString("LeagueOfAmazing!", 10));
		assertEquals("James", trimString("JamesTheIntern", 9));
		assertEquals("", trimString("TheWholeWord", 12));
	}
}
