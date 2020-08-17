
public class Checkpoint {
	public static void main(String[] args) {
		Checkpoint checkpoint = new Checkpoint();
		
		/*
		double[] listOne = new double[] {2, 6, 8, 3, 9, 1, 3};
		double[] listTwo = new double[] {34, 12, 90, 43, 35};
		double[] listThree = new double[] {109, 341, 351, 981};
		*/
		
		/*
		checkpoint.sort(listOne, 0);
		checkpoint .sort(listTwo, 0);
		checkpoint.sort(listThree, 0);
		*/
		
		/*
		checkpoint.sort(listOne, 1);
		checkpoint.sort(listTwo, 1);
		checkpoint.sort(listThree, 1);
		*/
		
		/*
		String[] strListOne = new String[] {"Grape", "Apple", "Orange", "Banana", "Peach"};
		String[] strListTwo = new String[] {"Square", "Circle", "Triangle", "Ellipse", "Rectangle", "Star", "Rhombus", "Parallelogram"};
		checkpoint.sort(strListOne);
		checkpoint.sort(strListTwo);
		*/
		
		int[] intListOne = new int[] {2, 4, 6, 8, 9, 13};
		int[] intListTwo = new int[] {265, 341, 412, 589, 921};
		
		/*
		checkpoint.search(intListOne, 4);
		checkpoint.search(intListOne, 7);
		checkpoint.search(intListTwo, 589);
		*/
		
		checkpoint.binarySearch(intListOne, 0, intListOne.length, 9);
		checkpoint.binarySearch(intListTwo, 0, intListTwo.length, 265);
		checkpoint.binarySearch(intListTwo, 0, intListTwo.length, 115);
	}
	
	public double[] sort(double[] list, int order) {
		for(int i=1; i<list.length; i++) {
			for(int j=i; j>0; j--) {
				if(order == 0) {
					if(list[j] < list[j-1]) {
						double x = list[j];
						list[j] = list[j-1];
						list[j-1] = x;
					}
				}
				else if(order == 1) {
					if(list[j] > list[j-1]) {
						double x = list[j];
						list[j] = list[j-1];
						list[j-1] = x;
					}
				}
			}
		}
		
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + ", ");
		}
		System.out.println();
		return list;
	}
	
	public int[] sort(int[] list) {
		for(int i=1; i<list.length; i++) {
			for(int j=i; j>0; j--) {
				if(list[j] < list[j-1]) {
					int x = list[j];
					list[j] = list[j-1];
					list[j-1] = x;
				}
			}
		}
		return list;
	}
	
	public String[] sort(String[] list) {
		for(int i=1; i<list.length; i++) {
			for(int j=i; j>0; j--) {
				if(list[j].compareTo(list[j-1]) < 0) {
					String x = list[j];
					list[j] = list[j-1];
					list[j-1] = x;
				}
			}
		}
		
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + ", ");
		}	
		System.out.println();
		return list;
	}
	
	public int search(int[] list, int searchNum) {
		for(int i=0; i<list.length; i++) {
			if(list[i] == searchNum) {
				System.out.println(i);
				return i;
			}
		}
		System.out.println(-1);
		return -1;
	}
	
	public int binarySearch(int[] list, int start, int end, int searchValue) {
		if(end >= start) {
			int mid = (start + end)/2;
			
			if(list[mid] == searchValue) {
				System.out.println(mid);
				return mid;
			}
			else if(list[mid] > searchValue) {
				return binarySearch(list, start, mid-1, searchValue);
			}
			else {
				return binarySearch(list, mid+1, end, searchValue);
			}
		}
		
		System.out.println(-1);
		return -1;
	}
}
