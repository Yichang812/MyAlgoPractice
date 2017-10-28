import java.util.*;
public class AvgOfLasNDigit {
	long last_sum = 0;
	int n;
	Queue<Integer> queue = new LinkedList<Integer>();
	
	public AvgOfLasNDigit(int n) {
		this.n = n;
	}
	
	public void add(int new_digit) {
		last_sum += new_digit;
		queue.add(new_digit);
		if(queue.size() > n) {
			last_sum -= queue.remove();
		}
		
	}
	public double getAvg() {
		return (double) last_sum / n;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AvgOfLasNDigit moving = new AvgOfLasNDigit(3);
		int m = 9;
		while(m-- > 0){
			System.out.println("Type the next digit:");
			int nextInt = in.nextInt();
			moving.add(nextInt);
			System.out.println("The average of last n digits is: " + moving.getAvg());
		}
		in.close();
		
	}
}
