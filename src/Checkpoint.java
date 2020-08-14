
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
		list = sort(list);
		return searchIteration(list, searchNum);
	}
	
	public int searchIteration(int[] list, int searchNum) {
		int low = 0;
		int middle = list.length/2;
		int high = list.length;
		int[] newList;
		
		if(list[middle] == searchNum) {
			return middle;
		}
		else if(list[middle] > searchNum) {
			newList = new int[middle];
			for(int i=low; i<middle; i++) {
				newList[i] = list[i];
			}
			return searchIteration(newList, searchNum);
		}
		else if(list[middle] > searchNum) {
			newList = new int[middle];
			for(int i=middle+1; i<high; i++) {
				newList[i-middle-1] = list[i];
			}
			return searchIteration(newList, searchNum);
		}
		
		return -1;
	}
}
