package One_D_Array;

public class Main {

	public static void main(String[] args) {
		
		int[]  marks=new  int[6];
		marks[0] = 45;
		marks[1] = 89;
		marks[2] = 56;
		marks[3] = 74;
		marks[4] = 62;
		marks[5] = 23;
		
		System.out.print("way 1 :");
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
		
		
		System.out.print("way 2 :");
		for(int no : marks) {
			System.out.print(no + " ");
		}
		System.out.println();
				
		
		

	}

}
