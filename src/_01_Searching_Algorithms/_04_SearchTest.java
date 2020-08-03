package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(_00_LinearSearch.linearSearch(new String[] {"Apple", "Banana", "Grapes", "Orange"}, "Grapes"), 2);
		assertEquals(_00_LinearSearch.linearSearch(new String[] {"March", "April", "May", "June", "July", "August", "September"}, "August"), 5);
		assertEquals(_00_LinearSearch.linearSearch(new String[] {"Car", "Airplane", "Boat", "Scooter", "Motorized Sofa"}, "Motorized Sofa"), 4);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arr = new int[] {0, 4, 13, 56, 78, 92, 106, 129, 142, 167, 193};
		assertEquals(_01_BinarySearch.binarySearch(arr, 0, arr.length, 56), 3);
		assertEquals(_01_BinarySearch.binarySearch(arr, 0, arr.length, 106), 6);
		assertEquals(_01_BinarySearch.binarySearch(arr, 0, arr.length, 167), 9);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] arr = new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		assertEquals(_02_InterpolationSearch.interpolationSearch(arr, 5), 1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(arr, 20), 4);
		assertEquals(_02_InterpolationSearch.interpolationSearch(arr, 45), 9);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] arr = new int[] {12, 34, 69, 91, 125, 174, 214, 257, 289, 312};
		assertEquals(_03_ExponentialSearch.exponentialSearch(arr, 69), 2);
		assertEquals(_03_ExponentialSearch.exponentialSearch(arr, 174), 5);
		assertEquals(_03_ExponentialSearch.exponentialSearch(arr, 257), 7);
	}
}
