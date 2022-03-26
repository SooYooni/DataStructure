package week4;
import java.util.Iterator;
import java.util.LinkedList;

public class NegativeItemIterator<E extends Comparable> implements Iterator {
	private Node<E> current;
	public NegativeItemIterator(LinkedList<E> list) {
		current = list.getNode(0); // 0th node
	}

	public boolean hasNext() {
		for ( ; current != null; current = current.next)
			if (current.item.compareTo(0) < 0)
				return true;
		return false;
	}
	
	public E next() {
		E tmp = current.item;
		current = current.next;
		return tmp;
	}
}