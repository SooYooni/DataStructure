package week4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListItemIterator implements Iterator<Comparable> {
	private Node current;
	public LinkedListItemIterator(LinkedList list) {
		current = list.getNode(-1);  // 더미 헤드
	}

	public boolean hasNext() {
		return current.next != null;
	}

	public Comparable next() {
		current = current.next;
		return (Comparable)(current.item);
	}
}