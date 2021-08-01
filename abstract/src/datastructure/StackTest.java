package datastructure;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.push(40);
		
		stack.printAll();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
