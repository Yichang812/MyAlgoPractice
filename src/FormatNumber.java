public class FormatNumber {
	public static void printCurrentFormat(double number) {
		// round the number
		number = Math.round(number * 100.0)/100.0;
		String[] numStr = String.valueOf(number).split("\\.");
		String integer = numStr[0];
		int index = integer.length()%3 == 0? 3:integer.length()%3;
		String result = integer.substring(0,index);
		integer = integer.substring(index, integer.length());
		while(integer.length()>=3) {
			result = result + ","+integer.substring(0,3);
			integer = integer.substring(3);
		}
		result = result + "." + numStr[1];
		System.out.println(number + "to currency format is: " +result);
	
	}
	
	public static void main(String[] args) {
		printCurrentFormat(1234.567);
		printCurrentFormat(1234.56);
		printCurrentFormat(12345678.00);
		printCurrentFormat(0.1);
		printCurrentFormat(123456);
		printCurrentFormat(1);
		printCurrentFormat(.1);
	}
}
