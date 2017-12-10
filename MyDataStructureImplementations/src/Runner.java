public class Runner
{


	public static void main(String[] args) {
		
		System.out.println("--------Stack Implementation --------");
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.print();

		System.out.println("Popped val = "+stack.pop());
		System.out.println("Popped val = "+stack.pop());
		System.out.println("Popped val = "+stack.pop());
		System.out.println("Popped val = "+stack.pop());
		System.out.println("Popped val = "+stack.pop());
		System.out.println("Popped val = "+stack.pop());
		stack.push(13);
		stack.print();
		System.out.println("Popped val = "+stack.pop());

		System.out.println("--------Queue Implementation --------");
		MyQueue queue = new MyQueue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.print();
		System.out.println("\n Dequeued value = "+queue.deQueue());
		queue.enQueue(7);
		queue.print();
		System.out.println("\n Dequeued value = "+queue.deQueue());
		System.out.println("\n Dequeued value = "+queue.deQueue());
		System.out.println("\n Dequeued value = "+queue.deQueue());
		System.out.println("\n Dequeued value = "+queue.deQueue());
		System.out.println("\n Dequeued value = "+queue.deQueue());
		System.out.println("\n Dequeued value = "+queue.deQueue());
	}
}