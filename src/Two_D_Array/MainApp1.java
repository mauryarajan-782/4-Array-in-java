package Two_D_Array;

public class MainApp1 {

	public static void main(String[] args) {
		
		int[][] numbers = new int[2][3];
		
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[1][0] = 40;
		numbers[1][1] = 50;
		numbers[1][2] = 60;
		
		System.out.println("Way 1 : ");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] +  " ");
			}
			System.out.println();
		}
		
		System.out.println("Way 2 : ");
		for(int[] row : numbers) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}
	
}