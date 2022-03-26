package week4;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator implements Iterator<Node>{
	private Node current;
	public LinkedListIterator(LinkedList list) {
		current = list.getNode(-1); // ���� ���
	}

	public boolean hasNext() {
		return current.next != null;
	}

	public Node next() {
		return current = current.next;
	}
}