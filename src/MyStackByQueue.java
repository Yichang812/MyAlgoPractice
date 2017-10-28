import java.util.*;
public class MyStackByQueue {
	
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	public MyStackByQueue() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}
	
	public void push(int item) {
		if(queue2.isEmpty()) {
			queue1.add(item);
		}else {
			queue2.add(item);
		}
		
	}
	
	public int pop() {
		if(queue2.isEmpty()) {
			while(queue1.size()>1) {
				queue2.add(queue1.poll());
			}
			return queue1.poll();
		}else{
			while(queue2.size()>1) {
				queue1.add(queue2.poll());
			}
			return queue2.poll();
		}
		
	}
	
	public int peek() {
		if(queue2.isEmpty()) {
			while(queue1.size()>1) {
				queue2.add(queue1.poll());
			}
			int result = queue1.poll();
			queue2.add(result);
			return result;
		}else{
			while(queue2.size()>1) {
				queue1.add(queue2.poll());
			}
			int result = queue2.poll();
			queue1.add(result);
			return result;
		}
	}
	
	public boolean isEmpty() {
		return queue1.isEmpty() && queue2.isEmpty();
	}
	
	public static void main(String[] args) {
		MyStackByQueue myS = new MyStackByQueue();
		myS.push(1);
		myS.push(2);
		myS.push(3);
		myS.push(4);
		while(!myS.isEmpty()) {
			System.out.println(myS.peek());
			System.out.println(myS.pop());
		}
	}
}
