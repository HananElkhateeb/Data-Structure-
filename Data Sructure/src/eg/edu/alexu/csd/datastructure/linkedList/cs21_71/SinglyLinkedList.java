package eg.edu.alexu.csd.datastructure.linkedList.cs21_71;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author HANAN SAMIR
 *
 */
public class SinglyLinkedList implements ILinkedList {
	/**
	 * hanan.
	 */
	private Node head = null;
	/**
	 * hanan.
	 */
	public class Node {
		/**
		 * hanan.
		 */
		public Object data;
		/**
		 * hanan.
		 */
		public Node next;
		/**
		 * @param element first polynomial.
		 * @param next first polynomial
		 */
		public Node(Object element, Node next) {
			this.data = element;
			this.next = next;
		}
	}
	/**
	 * hanan.
	 */
	public void print() {
		Node i = head;
		while (i != null) {
			System.out.println(i.data);
			i = i.next;
		}
	}
	/**
	* @param index first polynomial.
	* @param element second polynomial
	*/
	public void add(int index, Object element) {
		Node newnode = new Node(element, null);
		if (index == 0) {
			newnode.next = head;
			head = newnode;
		} else if (index < 0 || index > size())
			throw null;
		else {
			Node curr = head;
			for (int i = 1; i < index; i++) {
				curr = curr.next;
			}
			newnode.next = curr.next;
			curr.next = newnode;
		}
	}
	/**
	* @param element second polynomial.
	*/
	public void add(Object element) {
		if (head == null) {
			head = new Node(element, null);
		} else {
			Node newnode = new Node(element, null);
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newnode;
		}
	}
	/**
	* @param index first polynomial.
	* @return element second polynomial
	*/
	public Object get(int index) {
		if (index < 0 || index > size())
			throw null;
		else {
			Node curr = head;
			for (int i = 0; i < index; i++) {
				curr = curr.next;
			}
			return curr.data;
		}
	}
	/**
	* @param index first polynomial.
	* @param element second polynomial
	*/
	public void set(int index, Object element) {
		if (index < 0 || index > size())
			throw null;
		else {
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}

			current.data = element;
		}
	}
	/** Removes all of the elements from this list. */
	public void clear() {
		head = null;
	}
	/** @return true if this list contains no elements. */
	public boolean isEmpty() {
		return head == null;
	}
	/** Removes the element at the specified position in this list.
	 * @param index second polynomial */
	public void remove(int index) {
		if (index < 0 || index > size())
			throw null;

		if (index == 0) {
			head = head.next;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
		}
	}
	/**  @return the number of elements in this list. */
	  public int size() {
		Node i = head;
		int size = 0;
		while (i != null) {
			size++;
			i = i.next;
		}
		return size;
	}
	/**
	* @param fromIndex first polynomial.
	* @param toIndex second polynomial
	* @return the result polynomial
	*/
	public ILinkedList sublist(int fromIndex, int toIndex) {
		if (fromIndex < 0 || fromIndex > size() || toIndex < 0 || toIndex > size())
			throw null;
		else {
			SinglyLinkedList list = new SinglyLinkedList();
			for (int count = fromIndex; count <= toIndex; count++) {
				list.add(get(count));
			}
			return list;
		}
	}
	/**
	* @param o first polynomial.
	* @return the result polynomial
	*/
	public boolean contains(Object o) {
		Node i = head;
		while (i != null) {
			if (i.data.equals(o))
				return true;
			i = i.next;
		}
		return false;
	}

}
