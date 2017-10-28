public class ReverseWordsInSentence {
	public static String reverseWordsInSentence(String str) {
		String[] temp = str.split(" ");
		String result = "";
		for(int i = temp.length-1; i>=0; i--) {
			result += (temp[i]+ " ");
		}
		return result.trim();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWordsInSentence("Hellow World !"));
	}
}
