import java.util.concurrent.Semaphore;
import java.util.*;

class ListNode<E extends Comparable<E>>{
	static final int beignindex = 1 ;
	static final int endIndex = 2 ;
	static final int nomalNode = 0 ;
	boolean beingDeleted = false;
	int level = 0;
	
	
	
	E val;
	ListNode<E> right;
	ListNode<E> left;
	ListNode<E> down ;
	ListNode<E> up ; 
	
	/*lock and condition variable */
	//ReentrantLock nodelock = new ReentrantLock();
	Semaphore nodelock = new Semaphore(1);
	int resource = 1 ;


	
	public int beingaddedTolist = 0 ;
	public int BeingAdded = 0;
	public int deleted = 0 ;
	public int toDeleted = 0 ;
	
	int root  ;
	@SuppressWarnings("unchecked")
	ListNode(Comparable<E> data , int root) {
		this.val = (E) data;
		this.right = null;
		this.left = null;
		this.up = null;
		this.down = null;
		this.root = root ;
	}

	
	
	
	public E getdata()
	{
		return this.val;
	}
	public boolean isEndNode()
	{
		return this.root== endIndex;
	}
	public ListNode<E> getDown()
	{
		return this.down;
	}

	public ListNode<E> getUp()
	{
		return this.up;
	}
	public ListNode<E> getRight()
	{
		return this.right;
	}
	public ListNode<E> getLeft()
	{
		return this.left;
	}
	public void setLeft(ListNode<E> temp)
	{
		this.left = temp ;
	}
	public void setRight(ListNode<E> temp)
	{
		this.right = temp ;
	}
	public void setDown(ListNode<E> temp)
	{
		this.down = temp ;
	}
	public void setUp(ListNode<E> temp)
	{
		this.up = temp ;
	}

}
