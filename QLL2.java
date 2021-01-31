//Linked List implementation of Queue
import java.util.*;
public class QLL2
{
	Queue front,rear;
	class Queue
	{
		Queue next;
		int data;
		Queue(int key)
		{
			data=key;
			next=null;
		}
	}
	void enqueue(int key)
	{
		Queue new_node=new Queue(key);
		if(front==null)
		{
			front=rear=new_node;
			System.out.println(new_node.data+" is enqueued to the Queue");
			return;
		}
		rear.next=new_node;
		rear=new_node;
		System.out.println(new_node.data+" is enqueued to the Queue");
	}
	void dequeue()
	{
		if(front==null)
		{
			System.out.print("Queue is empty");
			return;
		}
		System.out.println(front.data+" is dequeued from the Queue");
		front=front.next;
	}
	public static void main(String args[])
	{
		//Queue queue=new Queue();
		QLL2 llist=new QLL2();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Exit");
			int n=sc.nextInt();
			if(n==1)
			{
				llist.enqueue(sc.nextInt());
			}
			else if(n==2)
			{
				llist.dequeue();
			}
			else if(n==3)
			{
				break;
			}
			else
				System.out.println("Wrong choice");
		}
	}
}
