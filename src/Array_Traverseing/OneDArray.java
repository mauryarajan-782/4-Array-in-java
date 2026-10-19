package Array_Traverseing;

public class OneDArray {

	public static void main(String[] args) {
		
		int[] a = {10,20,30};	
//			
//		for(int i=0; i<a.length; i++) {					//for loop
//			
//			System.out.print(a[i] + " ");
		
//		for(int i : a) {									//for-each loop
//			
//			System.out.print(i + " ");
		
//		int i=0;											//while loop
//		while(i<a.length) {
//			
//			System.out.print(a[i] + " ");
//			i++;
		
		int i=0;											//do-while loop
		do {
			
			System.out.print(a[i] + " ");
			i++;
			
		}while(i<a.length);
	}

}
