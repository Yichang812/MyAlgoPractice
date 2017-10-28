import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicateFromArray {
	public static int[] removeDuplicateFromArray(int[] array) {
		Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());
		int[] result = new int[set.size()];
		int n = 0;
		for(Integer i:set) {
			result[n++] = i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,6,3,7,8,0};
		System.out.println(Arrays.toString(removeDuplicateFromArray(input)));
	}
}
