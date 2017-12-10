class LinkedList
{
	private int data;
	LinkedList next;
	public LinkedList(int val)
	{
		data = val;
		next = null;
	}

	public int getdata()
	{
		return data;
	}
}
public class MyLinkedList {

	private LinkedList head = null, tail = null;
	private int size;
	
	void insertBeginning(int val)
	{
		if(head == null)
		{
			head = new LinkedList(val);
		}
		else
		{
			LinkedList newNode = new LinkedList(val);
			newNode.next = head;
			head = newNode;
		}

		size++;
	}

	int removeFromBeginning()
	{
		if(isEmpty())
		{
			return -1;
		}
		int val = head.getdata();
		head = head.next;
		return val;
	}

	boolean isEmpty()
	{
		return head == null;
	}

	int size()
	{
		return size;
	}


	void print()
	{
		LinkedList temp = head;
		System.out.println("\n");
		while(temp != null)
		{
			System.out.print(temp.getdata()+" ");
			temp = temp.next;
		}

	}


	void insertAtEnd(int val)
	{
		if(head == null)
		{
			head = new LinkedList(val);
			tail = head;
		}
		else
		{
			LinkedList newNode = new LinkedList(val);
			tail.next = newNode;
			tail = newNode;
		}
	}


	


}
