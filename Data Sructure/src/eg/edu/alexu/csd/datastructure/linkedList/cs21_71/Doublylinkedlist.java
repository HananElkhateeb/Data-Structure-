package eg.edu.alexu.csd.datastructure.linkedList.cs21_71;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author HANAN SAMIR
 *
 */
public class Doublylinkedlist implements ILinkedList {
	/**
	 * hanan.
	 */
	private Listnode head = null;
	/**
	 * hanan.
	 */
	public class Listnode {
		/**
		 * hanan.
		 */
		public Object value;
		/**
		 * hanan.
		 */
		public Listnode next;
		/**
		 * hanan.
		 */
		public Listnode previous;
		/**
		 * @param previous first polynomial.
		 * @param element first polynomial
		 * @param next first polynomial
		 */
		public Listnode(Listnode previous, Object element, Listnode next) {
			this.value = element;
			this.next = next;
			this.previous = previous;
		}

	}
	/**
	 * hanan.
	 */
	public void print() {
		Listnode i = head;
		while (i != null) {
			System.out.println(i.value);
			i = i.next;
		}
	}
	/**
	* @param index first polynomial.
	* @param element second polynomial
	*/
	public void add(int index, Object element) {
		Listnode newNode = new Listnode(null, element, null);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else if (index < 0 || index > size())
			throw null;
		else {
			Listnode i = head;
			for (int count = 0; count < index - 1; count++) {
				i = i.next;
			}
			newNode.next = i.next;
			newNode.previous = i;
			i.next = newNode;
		}
	}
	/**
	* @param element second polynomial.
	*/
	public void add(Object element) {
		if (head == null) {
			head = new Listnode(null, element, null);
		} else {
			Listnode i = head;
			while (i.next != null) {
				i = i.next;
			}
			Listnode newNode = new Listnode(i, element, null);
			i.next = newNode;
		}
	}
	/**
	* @param index first polynomial.
	* @return element second polynomial
	*/
	public Object get(int index) {
		if (index < 0 || index > size()) {
			throw null;
		}
		Listnode i = head;
		for (int count = 0; count < index; count++) {
			i = i.next;
		}
		return i.value;
	}
	/**
	* @param index first polynomial.
	* @param element second polynomial
	*/
	public void set(int index, Object element) {
		if (index < 0 || index > size()) {
			throw null;
		}
		Listnode i = head;
		for (int count = 0; count < index; count++) {
			i = i.next;
		}
		i.value = element;
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
		if (index < 0 || index > size()) {
			throw null;
		} else if (index == 0) {
			head = head.next;
			head.previous = null;
		} else {
			Listnode i = head;
			for (int count = 0; count < index - 1; count++) {
				i = i.next;
			}
			i.next = i.next.next;
		}

	}
	/**  @return the number of elements in this list. */
	public int size() {
		Listnode i = head;
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
		if (fromIndex < 0 || fromIndex > size() || toIndex < 0 || toIndex > size()) {
			throw null;
		}
		Doublylinkedlist newList = new Doublylinkedlist();
		for (int count = fromIndex; count <= toIndex; count++) {
			newList.add(get(count));
		}
		return newList;
	}
	/**
	* @param o first polynomial.
	* @return the result polynomial
	*/
	public boolean contains(Object o) {
		Listnode i = head;
		while (i != null) {
			if (i.value.equals(o)) {
				return true;
			}
			i = i.next;
		}
		return false;
	}

}
