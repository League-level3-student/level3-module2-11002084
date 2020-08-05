package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1
		if(times == 1) {
			//3. return number 
			return number;
		}
		
		//4. else return number + recursionMultiplication(number, times-1)
		else {
			return number + recursiveMultiplication(number, times-1);
		}
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDevideBy) {
		if(numberToDevideBy > number) {
			return number;
		}
		else {
			return 1 + recursiveDivision(number - numberToDevideBy, numberToDevideBy);
		}
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if(power == 1) {
			return number;
		}
		else {
			return number * recursivePower(number, power-1);
		}
		
	}
	
	
	
	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		assertEquals(369, recursiveMultiplication(123, 3));
		assertEquals(121, recursiveMultiplication(11, 11));
		assertEquals(88, recursiveMultiplication(11, 8));
	}
	
	
	@Test
	public void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(3, recursiveDivision(12, 4));
		assertEquals(6, recursiveDivision(72, 12));
		assertEquals(9, recursiveDivision(99, 11));
		assertEquals(4, recursiveDivision(444, 111));
	}
	
	
	@Test 
	public void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(27, recursivePower(3, 3));
		assertEquals(2048, recursivePower(2, 11));
		assertEquals(729, recursivePower(3, 6));
		assertEquals(625, recursivePower(5, 4));
	}
	
}
