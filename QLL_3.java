//Implementation of Queue using Stack.
import java.util.*;
public class QLL_3
{
	Stack<Integer> stk1=new Stack<>();
	Stack<Integer> stk2=new Stack<>();
	void enqueue(int data)
	{
		while(!stk1.isEmpty())
		{
			stk2.push(stk1.pop());
		}
		stk1.push(data);
		
		while(!stk2.isEmpty())
		{
			stk1.push(stk2.pop());
		}
	}
	int dequeue()
	{
		if(stk1.isEmpty())
		{
			System.out.println("Queue is Empty");
			System.exit(0);
		}
		 return stk1.pop();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		QLL_3 llist=new QLL_3();
		while(true)
		{
			System.out.println("Enter the options given below:");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Exit");
			int n=sc.nextInt();
			if(n==1)
			{
				llist.enqueue(sc.nextInt());
			}
			else if(n==2)
			{
				System.out.println(llist.dequeue()+" is dequeued");
			}
			else if(n==3)
			{
				break;
			}
			else 
			{
				System.out.println("Wrong choice");
			}
		}
	}
}
