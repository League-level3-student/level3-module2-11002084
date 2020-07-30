package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int x;
		int y;
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			
			for(int i=0; i<array.length-1; i++) {
				if(array[i] > array[i+1]) {
					x = array[i];
					y = array[i+1];
				
					array[i] = y;
					array[i+1] = x;
				}
			}
		
			for(int i=0; i<array.length-1; i++) {
				if(array[i] > array[i+1]) {
					sorted = false;
					break;
				}
			}
			
			display.updateDisplay();
		}
	}
	
}
