package Anonymous_Array;

public class AnonymousArray {

	public static void main(String[] args) {
		
		AnonymousArray.sum(new int[] {10,20,30});  //Anonymous Array
	}
	static void sum(int[] no) {		// sirf method ke andar use hua aur khi v nhi use hua
		
		int total = 0;
		for(int i : no) {
			total = total + i;
		}
		System.out.println("Sum is : " + total);
	}

}
