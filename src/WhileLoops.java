
public class WhileLoops {

	public static void main(String[] args) {
		
		int A;
		A = 1;
		
		while (A <= 10) {
			
			System.out.println(A);
			if (A %2 == 0) {
				System.out.println("Even");
			}
			else {
				System.out.println("odd");
			}
			A++;
		}
	}

}