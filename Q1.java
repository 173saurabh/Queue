//Introduction and array implementation
import java.util.*;
class Queue
{
	int front,rear,size,capacity;
	int arr[];
	Queue(int capacity)
	{
		this.capacity=capacity;
		front=this.size=0;
		rear=capacity-1;
		arr=new int[this.capacity];
	}
	boolean isFull(Queue queue)
	{
		return queue.size==queue.capacity;
	}
	boolean isEmpty(Queue queue)
	{
		return queue.size==0;
	}
	void enqueue(int item)
	{
		if(isFull(this))
			return;
		this.rear=(this.rear+1)%this.capacity;
		this.size=this.size+1;
		this.arr[this.rear]=item;
		System.out.println(item+" is enqueued to the Queue");
	}
	void dequeue()
	{
		if(isEmpty(this))
			return;
		int item=this.arr[this.front];
		this.front=(this.front+1)%this.capacity;
		this.size-=1;
		System.out.println(item+" is dequeued from the queue");
	}
	void front()
	{
		if(isEmpty(this))
			return;
		System.out.println("Front item is "+this.arr[this.front]);
	}
	void rear()
	{
		if(isEmpty(this))
			return;
		System.out.println("Rear item is "+this.arr[this.rear]);
	}
}
public class Q1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Queue queue=new Queue(1000);
		while(true)
		{
			//System.out.println("Choose the following option given below");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Front");
			System.out.println("4. Rear");
			System.out.println("5. Exit");
			int n=sc.nextInt();
			if(n==1)
			{
				queue.enqueue(sc.nextInt());
			}
			else if(n==2)
			{
				queue.dequeue();
			}
			else if(n==3)
			{
				queue.front();
			}
			else if(n==4)
			{
				queue.rear();
			}
			else if(n==5)
			{
				break;
			}
			else
				System.out.println("Wrong choice");
		}
	}
}
