package Three_D_Arrary;

public class threeDArrary {

	public static void main(String[] args) {
		
		int[][][] a = {{{10,20},{30,40,50,60,},{70,80,90}}};
		
//		System.out.println(a);								//output : [[[I@1dbd16a6
//		System.out.println(a[0]);							//output : [[I@1dbd16a6
//		System.out.println(a[0][0]);							//output : [I@1dbd16a6
//		System.out.println(a[0][0][0]);						//output : 10
//		System.out.println(a[0][0][1]);						//output : 20
//		System.out.println(a[0][1][0]);						//output : 30
//		System.out.println(a[0][1][1]);						//output : 40
//		System.out.println(a[0][1][2]);						//output : 50
//		System.out.println(a[0][2][0]);						//output : 70
//		System.out.println(a.length);						//output : 1
//		System.out.println(a[0].length);						//output : 3
//		System.out.println(a[0][0].length);					//output : 2
//		System.out.println(a[0][1].length);					//output : 4
//		System.out.println(a[0][2].length);					//output : 3
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
