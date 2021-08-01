package datastructure;

public class QueueTest {

	public static void main(String[] args) {
		
		MyLinkedQueue listQue = new MyLinkedQueue();
		
		listQue.enQueue("A");
		listQue.enQueue("B");
		listQue.enQueue("C");
		
		listQue.printAll();
		
		System.out.println(listQue.deQueue());
		System.out.println(listQue.deQueue());

	}

}
