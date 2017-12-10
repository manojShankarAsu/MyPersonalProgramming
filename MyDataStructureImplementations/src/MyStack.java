class MyStack
{
	private MyLinkedList linkListObj;

	public MyStack()
	{
		linkListObj = new MyLinkedList();
	}
	
	void push(int data)
	{
		linkListObj.insertBeginning(data);
	}

	int pop()
	{
		return linkListObj.removeFromBeginning();
	}

	boolean isEmpty()
	{
		return linkListObj.isEmpty();
	}

	void print()
	{
		linkListObj.print();
	}
}