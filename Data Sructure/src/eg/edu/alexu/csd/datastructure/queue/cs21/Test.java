package eg.edu.alexu.csd.datastructure.queue.cs21;

public class Test {

	public static void main(String[] args) {
		/*Qarray q=new Qarray(10);
		
		q.enqueue(5);
		q.enqueue(9);
		//System.out.println(q.dequeue());
		q.enqueue(13);
		q.enqueue(10);
		System.out.println(q.size());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		q.enqueue(13);
		q.enqueue(10);
		q.enqueue(13);
		q.enqueue(10);
		q.enqueue(13);
		q.enqueue(13);*/
		Qlinkedlist q=new Qlinkedlist();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
	}

}
