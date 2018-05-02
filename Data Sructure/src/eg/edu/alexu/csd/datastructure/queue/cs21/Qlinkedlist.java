package eg.edu.alexu.csd.datastructure.queue.cs21;

import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * @author HANAN SAMIR
 *
 */
public class Qlinkedlist implements IQueue, ILinkedBased {
	/**
	 * hanan.
	 */
	private Node first;
	/**
	 * hanan.
	 */
	private Node rear;
	/**
	 * hanan.
	 */
	private int items;
	/**
	 * hanan.
	 */
	private class Node {
		/**
		 * hanan.
		 */
		Object item;
		/**
		 * hanan.
		 */
		Node next;
	}
	/**
	 * hanan.
	 */
	public Qlinkedlist() {
		first = null;
		rear = null;
		items = 0;
	}
	/**
	* Inserts an item at the queue front.
	* @param item infix expression
	*/
	public void enqueue(Object item) {
		Node oldRear = rear;
		rear = new Node();
		rear.item = item;
		rear.next = null;
		if (isEmpty()) {
			first = rear;
		} else {
			oldRear.next = rear;
		}
		items++;
	}
	/**
	* Removes the object at the queue rear and returns it.
	* @return postfix expression
	*/
	public Object dequeue() {
		Object item = first.item;
		first = first.next;
		if (isEmpty()) {
			throw null;
		}
		items--;
		return item;
	}
	/**
	* Tests if this queue is empty.
	* @return postfix expression
	*/
	public boolean isEmpty() {
		return items == 0;
	}
	/**
	* Returns the number of elements in the queue.
	* @return postfix expression
	*/
	public int size() {
		return items;
	}

}
