public class IsDividedByThree {

	private static int sum = 0;
	
	public static boolean isDividedByThree(int i) {
		sum = sum * 2 + i;
		return sum % 3 == 0;
		
	}
	public static void main(String[] args) {
		System.out.println(isDividedByThree(1));
		System.out.println(isDividedByThree(1));
		System.out.println(isDividedByThree(0));
		System.out.println(isDividedByThree(1));
	}

}
