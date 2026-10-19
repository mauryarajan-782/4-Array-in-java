package Two_D_Array;

public class MainApp2 {

	public static void main(String[] args) {
		
		int[][] numbers = { {10,20,30,40},{50,60},{70,80,90}};
		
		System.out.println("Numbers are : ");
		for(int[] row : numbers) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}
	
}