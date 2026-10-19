package Anonymous_Array;

public class Anonymous2DArray {

	public static void main(String[] args) {
		
		Anonymous2DArray.sum(new int[][] {{10,20,30},{40,50}});  //Multi Dimesional Anonymous Array
	}
	static void sum(int[][] no) {		
		
		int total = 0;
		for(int[] ii : no) {
			for(int i : ii) {
				total = total + i;
			}
		}
		System.out.println("Sum is : " + total);
	}

}
