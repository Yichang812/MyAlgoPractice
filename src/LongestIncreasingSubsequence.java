import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public static int lengthOfLIS(int[] input) {
		if(input == null || input.length == 0) return 0;
		
		int[] record = new int[input.length];
		int len = 1;
		record[0] = input[0];
		for(int i = 1; i<input.length; i++) {
			if(input[i] > record[len-1]) {
				record[len] = input[i];
				len++;
			}else {
				int temp = Arrays.binarySearch(record, 0, len-1, input[i]);
				if(temp<0) {
					record[-temp-1] = input[i];
				}
			}
		}
		return len;
	}
	
	public static void main(String[] args) {
		int[] test1 = {1,2,6,3};
		int[] test2 = {1};
		int[] test3 = {};
		int[] test4 = {1,2,6,3,4};
		System.out.println("the length of lis for "+Arrays.toString(test1)+" is: " + 
	Integer.toString(lengthOfLIS(test1)));
		System.out.println("the length of lis for "+Arrays.toString(test2)+" is: " + 
				Integer.toString(lengthOfLIS(test2)));
		System.out.println("the length of lis for "+Arrays.toString(test3)+" is: " + 
				Integer.toString(lengthOfLIS(test3)));
		System.out.println("the length of lis for "+Arrays.toString(test4)+" is: " + 
				Integer.toString(lengthOfLIS(test4)));
	}
}
