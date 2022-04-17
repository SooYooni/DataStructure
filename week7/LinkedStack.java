package week7;

public class LinkedStack<E> implements StackInterface<E> {
	private Node<E> topNode;
	private final E ERROR = null;   // ������ ���� ��
	public LinkedStack() {
		topNode = null;
	}
	
	// [�˰��� 6-7] ����: ���ÿ� ���� x �����ϱ�
	public void push(E newItem) {
		topNode = new Node<>(newItem, topNode);
	}
	
	// [�˰��� 6-8] ����: ���ÿ��� ���� �����ϱ�
	public E pop() {
		if (isEmpty( )) return ERROR;
		else {
			Node<E> temp = topNode;
			topNode = topNode.next;
			return temp.item;
		}
	}
	
	// [�˰��� 6-9] ����: ���� ž ���� �˷��ֱ�
	public E top() {
		if (isEmpty()) return ERROR; 
		else return topNode.item;
	}
	
	// [�˰��� 6-10] ����: ������ ������� Ȯ���ϱ�
	public boolean isEmpty() {
		return (topNode == null);
	}
	
	// [�˰��� 6-11] ����: ���� ����
	public void popAll() {
		topNode = null;
	}

	//////////////////////////////////////////////
	public void printAll() {
		Node<E> t;
		System.out.print("Stack from top: ");
		for(t=topNode; t != null; t = t.next) {
			System.out.print(t.item + " ");
		}
		System.out.println();
	}
} // �ڵ� 6-4
