package eg.edu.alexu.csd.datastructure.stack.cs21;

public class main {

	public static void main(String[] args) {
	/*	Stack h=new Stack();
		h.add(0, 'a');
		h.add(1, 'b');
		h.add(2, 'c');
		h.add(3, 'd');
		
		h.display();
		System.out.println("--------");
		/*System.out.println(h.pop());
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.peek());

		h.push('r');
		h.display();*/
		ExpressionEvaluator h=new ExpressionEvaluator();
		
		System.out.println(h.evaluate(h.infixToPostfix("0+1*0+1")));
  }
}