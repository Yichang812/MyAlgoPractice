import java.util.*;

public class MyQueueByStack {
	
	Stack<Integer> inbox;
	Stack <Integer> outbox;
	
	 /** Initialize your data structure here. */
    public MyQueueByStack() {
        inbox = new Stack<Integer>();
        outbox = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void enQueue(int x) {
        inbox.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int deQueue() {
        if(outbox.isEmpty()) {
	        	while(!inbox.isEmpty()) {
	        		outbox.push(inbox.pop());
	        	}
        }
        return outbox.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	if(outbox.isEmpty()) {
        	while(!inbox.isEmpty()) {
        		outbox.push(inbox.pop());
        	}
    }
    return outbox.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
    
	public static void main(String[] args) {
		MyQueueByStack myQ = new MyQueueByStack();
		myQ.enQueue(1);
		myQ.enQueue(2);
		myQ.enQueue(3);
		myQ.enQueue(4);
		while(!myQ.empty()) {
			System.out.println(myQ.peek());
			System.out.println(myQ.deQueue());
		}
		
	}

}
