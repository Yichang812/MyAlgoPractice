import java.util.Scanner;

public class BitWiseOperation {
	
	public static int flipNthBit(int number, int n) {
		return number ^ (1 << n);
	}
	public static void printPositiveBinary(int n) {
		String result = "";
		while(n>1) {
			String cur = Integer.toString(n % 2);
			result = cur + result;
			n = n/2;
		}
		result = Integer.toString(n) + result;
		System.out.println("Convert " + n + "to binary is: " + result);
	}

	public static void main(String[] args) {
		int a = 60;	/* 60 = 0011 1100 */
	      int b = 13;	/* 13 = 0000 1101 */
	      int c = 0;

	      c = a & b;        /* 12 = 0000 1100 */
	      System.out.println("a & b = " + c );

	      c = a | b;        /* 61 = 0011 1101 */
	      System.out.println("a | b = " + c );

	      c = a ^ b;        /* 49 = 0011 0001 */
	      System.out.println("a ^ b = " + c );

	      c = ~a;           /*-61 = 1100 0011 */
	      System.out.println("~a = " + c );

	      c = a << 2;       /* 240 = 1111 0000 */
	      System.out.println("a << 2 = " + c );

	      c = a >> 2;       /* 15 = 1111 */
	      System.out.println("a >> 2  = " + c );

	      // no matter what the left most digit is, add 0
	      c = a >>> 2;      /* 15 = 0000 1111 */
	      System.out.println("a >>> 2 = " + c );
	      
	      c = flipNthBit(a, 2);
	      System.out.println("a flip 2nd bit = " + c);
	      
	      System.out.print("00111101 parse to binary number  = " + Integer.parseInt("00111101", 2));
	      
	      
	      
	      
	      Scanner in = new Scanner(System.in);
	      System.out.println("Please input a positive number:");
	      int number = in.nextInt();
	      if(number<0) {
	    	  	System.out.println("Error! The input number is negtive.");
	      }else {
	    	  	printPositiveBinary(number);
	      }
	      in.close();

	}

}
