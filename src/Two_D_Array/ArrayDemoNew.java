package Two_D_Array;

public class ArrayDemoNew {

	public static void main(String[] args) {
		
		int[][] a = { {10,20,30,40},{50,60},{70,80,90} };
			
//		System.out.println(a);					//output:[[I@1dbd16a6 double-dimensional int-Array
//		System.out.println(a[0]);				//output:[I@1dbd16a6 single-dimensional int-Array
//		System.out.println(a[0][0]);				//output:10
//		System.out.println(a.length);			//output:3 main array ki length
//		System.out.println(a[0].length);			//output:4
//		System.out.println(a[1].length);			//output:2
//		System.out.println(a[2].length);			//output:3
//		System.out.println(a[0][0].length);		//isaki koi length nhi hai so, provide error
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
