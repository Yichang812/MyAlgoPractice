import java.util.LinkedList;

class ListNode{
	int key;
	ListNode next;
	public ListNode(int key) {
		this.key = key;
		next = null;
	}
}

public class FindLastNNodeInList {
	
	//find the (leng-n+1)th Node
	public static ListNode findLastNNodeInList1(LinkedList<ListNode> list, int n) {
		if(list.isEmpty()) return null;
		return list.get(list.size()-n);
	}
	
	public static void main(String[] args) {
		LinkedList<ListNode> list = new LinkedList<ListNode>();
		list.add(new ListNode(1));
		list.add(new ListNode(2));
		list.add(new ListNode(3));
		list.add(new ListNode(4));
		list.add(new ListNode(5));

		System.out.println(findLastNNodeInList1(list, 2).key);
	}

}
