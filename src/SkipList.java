import java.awt.List;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SkipList<E extends Comparable<E>> {
	private int height  = 0 ; 
	private ListNode<E> begin ;
	private ListNode<E>  end ;
	private ListNode<E> bottomBegin;
	private ListNode<E> bottomEnd;
	Random coin ;
	Semaphore safetyLock = new Semaphore(1);
	Semaphore safetyLock2 = new Semaphore(1);
	Semaphore sagetyLock3 = new Semaphore(1);
	//Lock safetyLock4 =  new ReentrantLock();

	public SkipList ()
	{

		this.begin = new ListNode<E>(null ,ListNode.beignindex ) ;
		this.end  = new ListNode<E>(null, ListNode.endIndex);

		this.bottomBegin = this.begin;
		this.bottomEnd = this.end;
		begin.setRight(end) ;
		end.setLeft(begin);
		this.coin= new Random();
	}


	public int getHeight ()
	{
		return height;
	}

	public ListNode<E>  bottomBegin()
	{
		return this.bottomBegin;
	}
    // level shi cong diji cheng jia
	@SuppressWarnings("unchecked")
	public  ListNode<E>  search(Comparable<E> data, boolean insertFind , int level) throws InterruptedException
	{
		int numDropDown = 0;

		int numForward = 0;
		
		boolean hasInserted  =  false ;

		ListNode<E> FirstNode = this.begin;
		ListNode<E> dropDown = null;

		//System.out.println("search permists is " + FirstNode.nodelock.availablePermits());

		while(  FirstNode.nodelock.availablePermits() == 0 )
		{
			Thread.currentThread();
			Thread.sleep(6);
			System.out.println(Thread.currentThread().getName()+ "is sleeping !!!!!!!!!!!!!!!!!!!!!!!!! ");
		}

		while(FirstNode.getDown()!= null)
		{

			//System.out.println("search permists is " + FirstNode.nodelock.availablePermits());

			while(  FirstNode.getDown().nodelock.availablePermits()==0 )
			{
				Thread.currentThread();
				Thread.sleep(6);
				System.out.println(Thread.currentThread().getName()+ "is sleeping !!!!!!!!!!!!!!!!!!!!!!!!! ");
			} 
			FirstNode = FirstNode.getDown();



			numDropDown ++;
			while(FirstNode.getRight().getdata()!=null && FirstNode.getRight().getdata().compareTo( (E) data)<=0)
			{
				//System.out.println("search permists is " + FirstNode.nodelock.availablePermits());
				while (  FirstNode.getRight().nodelock.availablePermits()==0 )
				{
					Thread.currentThread();
					Thread.sleep(6);
					System.out.println(Thread.currentThread().getName()+ "is sleeping !!!!!!!!!!!!!!!!!!!!!!!!! ");
				}
				FirstNode = FirstNode.getRight();
				numForward++;
			}
			if(numDropDown >= level &&  insertFind)
			{   
				hasInserted = true;
				FirstNode.nodelock.acquire(1);
				FirstNode.getRight().nodelock.acquire(1);
				ListNode<E> newNode = new ListNode<E>(data, ListNode.nomalNode);
				
				FirstNode.getRight().setLeft(newNode);
				newNode.setRight(FirstNode.getRight());
				FirstNode.setRight(newNode);
				newNode.setLeft(FirstNode);
				if(dropDown != null)
				{
					newNode.setUp(dropDown);
					dropDown.setDown(newNode);
				}
				dropDown = newNode;
				
				FirstNode.nodelock.release(1);
				FirstNode.getRight().getRight().nodelock.release(1);
			}
			
			//			FirstNode.nodelock.lock();
		}

		if(!insertFind && FirstNode.getdata()==null){
			return null;
		}

		// if insertFind
		if(!insertFind && FirstNode.getdata().compareTo((E) data)==0  )
		{
			return FirstNode;
		}
		if(!insertFind && FirstNode.getdata().compareTo((E) data)!=0 )
		{
			return null;
		}
		else
		{
			return FirstNode.getRight();
		}
		
	}



	@SuppressWarnings("null")
	public boolean delete(Comparable<E> key ) throws InterruptedException
	{
		ListNode<E> store = search(key,false ,0);
		if(store == null)
		{
			System.out.println("has not found the value  So can nNNNNNN!!!!!!!!!!!!!!" +   key);
			return false ;
		}

		if(store.beingDeleted == true )
		{
			System.out.println("it is being deleted");
			return false ;
		}

		ListNode<E> ToBeDeleted = store;
		ListNode<E> FirstUpNode = null ; 

		// lock all nodes equal to key
		while (ToBeDeleted!=null)
		{   
			while(ToBeDeleted.nodelock.availablePermits()==0)
			{
				Thread.currentThread();
				Thread.sleep(6);
				System.out.println(Thread.currentThread().getName()+ "is sleeping !!!!!!!!!!!!!!!!!!!!!!!!! ");
			}
			ToBeDeleted.nodelock.acquire(1);

			ToBeDeleted.beingDeleted = true;
			FirstUpNode = ToBeDeleted ;
			ToBeDeleted = ToBeDeleted.getUp();
		}
		ToBeDeleted = FirstUpNode;

		// delete the node 
		do{

			ListNode<E> leftNode = ToBeDeleted.getLeft();
			ListNode<E> rightNode = ToBeDeleted.getRight();



			leftNode.nodelock.acquire(1);

			rightNode.nodelock.acquire(1);



			leftNode.setRight(rightNode);
			rightNode.setLeft(leftNode);
			// unlock the left and right node
			leftNode.nodelock.release(1);
			//leftNode.notify();
			rightNode.nodelock.release(1);
			ToBeDeleted.nodelock.release(1);
			ToBeDeleted = ToBeDeleted.getDown();

		}while (ToBeDeleted!=null );




		resrtructure(this.begin);





		System.out.println(Thread.currentThread().getName() + "   deleted  " + key);



		return true;
	}

	/* might need to decrement the height
	 * 
	 * 
	 */
	private void resrtructure(ListNode<E> TopLeft ) throws InterruptedException
	{
		ListNode<E> temp = TopLeft;
		temp = temp.getDown();
		while(temp.getRight().isEndNode())
		{
			safetyLock2.acquire();
			this.begin = temp;
			this.end = temp.getRight();
			temp = temp.getDown();
			this.height--;
			safetyLock2.release();

		}
	}

	public void print()
	{
		ListNode<E> start = this.begin;
		ListNode<E> move = start ; 
		while (start!= null)
		{
			while (move != null)
			{
				if(move.getdata()==null && !move.isEndNode())
				{
					System.out.print("minus infinity ");
				}
				else if(move.getdata()==null && move.isEndNode())
				{
					System.out.print ("plus infinity ");
				}
				else
				{
					System.out.print(move.getdata());
					System.out.print("   ");
				}
				move= move.getRight();
			}
			start = start.getDown();
			move = start ; 
			System.out.println();

		}

	}



	@SuppressWarnings("unchecked")
	public boolean  insert(Comparable<E> data) throws Exception {
		// TODO Auto-generated method stub
		if(this.search(data,false , 0)!=null)
		{
			return false;
		}

		int count  = 0 ; 
		boolean toss = true;
		while (toss)
		{
			int flip = this.coin.nextInt(2);
			if(flip == 1)
			{
				count++;
			}
			else
			{
				toss = false ;
			}
		}		
		// increase level if necessary
		while(count>= this.height)
		{
			safetyLock.acquire();

			ListNode<E> rootSub = new ListNode<E>(null, ListNode.beignindex);
			ListNode<E> endSub = new ListNode<E>(null, ListNode.endIndex);
			rootSub.setRight(endSub);
			endSub.setLeft(rootSub);

			rootSub.setDown(this.begin);
			this.begin.setUp(rootSub);
			endSub.setDown(end);
			end.setUp(endSub);
			this.height++;
			this.begin = rootSub;
			this.end = endSub;		
			safetyLock.release();

		}
		// insert in  multiple level;
		try{
			ListNode<E> iii = search(data,true, this.height-count);
			if( iii != null)
			{
				System.out.println("we adddddddddddd" +iii.getdata());
				return true;
			}
		}
		catch(Exception E){
			System.out.println(data);
			System.out.println("key exist");
		}
		finally{
			System.out.println("go ahead ");
		}
		
		System.out.println(data+ "the node has been inserted by another thread");
		return false ;
	}


	


	/*
	 *   ListNode<E> begin: the leftmost ListNode in a certain row
	 *   
	 */
	
	
	
	
	
	
}