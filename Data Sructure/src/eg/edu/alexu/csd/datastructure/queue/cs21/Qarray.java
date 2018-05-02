package eg.edu.alexu.csd.datastructure.queue.cs21;

import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * @author HANAN SAMIR
 *
 */
public class Qarray implements IQueue, IArrayBased {
	/**
	 * hanan.
	 */
	private int front;
	/**
	 * hanan.
	 */
	private int last;
	/**
	 * hanan.
	 */
	private Object[] arr;
	/**
	 * hanan.
	 */
	private int items;
	/**
	 * @param maxsize infix expression.
	 */
	public Qarray(int maxsize) {
		arr = (Object[]) new Object[maxsize];
		front = 0;
		last = -1;
		items = 0;
	}
	/**
	 * @return postfix expression.
	 */
	public boolean isFull() {
		return (items == arr.length);
	}
	/**
	* Inserts an item at the queue front.
	* @param item infix expression
	*/
	public void enqueue(Object item) {
		if (this.isFull()) {
			throw null;
		} else {
			last = (last + 1) % arr.length;
			arr[last] = item;
			items++;
		}
	}
	/**
	* Removes the object at the queue rear and returns it.
	* @return postfix expression.
	*/
	public Object dequeue() {
		if (this.isEmpty()) {
			throw null;
		} else {
			Object temp = arr[front];
			arr[front] = null;
			front = (front + 1) % arr.length;
			items--;
			return temp;
		}
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
