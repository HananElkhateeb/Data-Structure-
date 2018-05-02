package eg.edu.alexu.csd.datastructure.linkedList.cs21_71;

//import org.junit.Assert;
//
//import org.junit.Test;

/**
 * @author HANAN SAMIR
 *
 */
public class Testt {
//	
//	@Test
//	public void testcorrectinsertion() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		h.add(3, 'd');
//		h.add(4, 'e');
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		x.add(3, 'd');
//		x.add(4, 'e');
//		Assert.assertEquals('a', h.get(0));
//		Assert.assertEquals('b', h.get(1));
//		Assert.assertEquals('c', h.get(2));
//		Assert.assertEquals('d', h.get(3));
//		Assert.assertEquals('e', h.get(4));
//		Assert.assertEquals('a', x.get(0));
//		Assert.assertEquals('b', x.get(1));
//		Assert.assertEquals('c', x.get(2));
//		Assert.assertEquals('d', x.get(3));
//		Assert.assertEquals('e', x.get(4));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test(expected = NullPointerException.class)
//	public void testindexoutofbondary() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		h.get(4);
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		x.get(4);
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testaddingatmiddle() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		h.add(3, 'd');
//		h.add(1, 'x');
//		h.add(4, 'f');
//		Assert.assertEquals('x', h.get(1));
//		Assert.assertEquals('f', h.get(4));
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		x.add(3, 'd');
//		x.add(1, 'x');
//		x.add(4, 'f');
//		Assert.assertEquals('x', x.get(1));
//		Assert.assertEquals('f', x.get(4));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testset() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		h.set(0, 'h');
//		Assert.assertEquals('h', h.get(0));
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		x.set(0, 'h');
//		Assert.assertEquals('h', x.get(0));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testsublist() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		Doublylinkedlist newList = new Doublylinkedlist();
//		SinglyLinkedList newlist = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		h.add(3, 'd');
//		h.add(4, 'e');
//		newList = (Doublylinkedlist) h.sublist(1, 3);
//		Assert.assertEquals(3, newList.size());
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		x.add(3, 'd');
//		x.add(4, 'e');
//		newlist = (SinglyLinkedList) x.sublist(1, 3);
//		Assert.assertEquals(3, newlist.size());
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testremove() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		h.remove(1);
//		Assert.assertEquals(2, h.size());
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		x.remove(1);
//		Assert.assertEquals(2, x.size());
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testvalidconyain() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		Assert.assertEquals(true, h.contains('a'));
//		Assert.assertEquals(false, h.contains('h'));
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		Assert.assertEquals(true, x.contains('a'));
//		Assert.assertEquals(false, x.contains('h'));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testclear() {
//		Doublylinkedlist h = new Doublylinkedlist();
//		SinglyLinkedList x = new SinglyLinkedList();
//		h.add(0, 'a');
//		h.add(1, 'b');
//		h.add(2, 'c');
//		h.clear();
//		x.add(0, 'a');
//		x.add(1, 'b');
//		x.add(2, 'c');
//		x.clear();
//		Assert.assertEquals(true, h.isEmpty());
//		Assert.assertEquals(true, x.isEmpty());
//	}

}
