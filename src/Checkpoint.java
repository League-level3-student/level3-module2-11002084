
public class Checkpoint {
	public static void main(String[] args) {
		
	}
	
	public int[] sort(int[] list) {
		for(int i=1; i<list.length; i++) {
			for(int j=i; j>0; j++) {
				if(list[j] < list[j-1]) {
					int x = list[j];
					list[j] = list[j-1];
					list[j-1] = x;
				}
			}
		}
		
		return list;
	}
}
