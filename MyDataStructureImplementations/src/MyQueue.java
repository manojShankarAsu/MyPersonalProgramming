class MyQueue
{
	private MyLinkedList linkedListObj;

	public MyQueue()
	{
		linkedListObj = new MyLinkedList();
	}
	public void enQueue(int val)
	{
		linkedListObj.insertAtEnd(val);
	}

	public int deQueue()
	{
		return linkedListObj.removeFromBeginning();
	}

	public boolean isEmpty()
	{
		return linkedListObj.isEmpty();
	}

	public void print()
	{
		linkedListObj.print();
	}
}