import java.util.Arrays;

public class Sort {
	private static int partition(int[] input, int low, int high) {
		int i = low -1;
		int pivot = input[high];
		
		for(int j = low; j<high; j++) {
			if(input[j]<pivot) {
				i++;
				swap(input, i, j);
			}
		}
		swap(input, i+1, high);
		return i+1;
	}
	
	private static void swap(int[] input, int indexA, int indexB) {
		int temp;
		temp = input[indexA];
		input[indexA] = input[indexB];
		input[indexB] = temp;
	}
	
	public static int[] quickSort(int[] input, int low, int high) {
		if(low<high) {
			int pivot = partition(input, low, high);
			quickSort(input, low, pivot-1);
			quickSort(input, pivot +1, high);
		}
		return input;
	}
	
	
	public static int[] bubbleSort(int[] input, int length) {
		if(length>1) {
			for(int i = 0; i<length-1; i++) {
				if(input[i]>input[i+1]) {
					swap(input, i, i+1);
				}
			}
			bubbleSort(input, length-1);
		}
		return input;
	}
	
	
	public static int[] mergeSort(int[] input, int left, int right) {
		if(left<right) {
			int middle = (left + right)/2;
			mergeSort(input, left, middle);
			mergeSort(input, middle+1, right);
			merge(input, left, middle, right);
		}
		return input;
	}
	
	private static void merge(int[] input, int leftStart, int leftEnd, int rightEnd) {
		int left = leftStart;
		int right = leftEnd+1;
		int[] temp = new int[input.length];
		int index = leftStart;
		while(left <= leftEnd && right <= rightEnd) {
			if(input[left] < input[right]) {
				temp[index] = input[left];
				left++;
			}else {
				temp[index] = input[right];
				right++;
			}
			index++;
		}
		System.arraycopy(input, left, temp, index, leftEnd-left+1);
		System.arraycopy(input, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, input, leftStart, rightEnd-leftStart+1);
		
	}
	
	public static void main(String[] args) {
		int[] test1 = {10, 80, 30, 90, 40, 50, 70};
		int[] test2 = {10, 80, 30, 90, 40, 50, 70};
		int[] test3 = {10, 80, 30, 90, 40, 50, 70};

		System.out.println(Arrays.toString(quickSort(test1, 0, test1.length-1)));
		System.out.println(Arrays.toString(bubbleSort(test2, test2.length)));
		System.out.println(Arrays.toString(mergeSort(test3,0,test3.length-1)));
	}

}
