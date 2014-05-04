import java.util.ArrayList;
import java.util.Random;


public class SkipListThread<E extends Comparable<E> > implements Runnable{
	private static int numThread = 0 ;
	private SkipList<E> list ; 
	private ArrayList<E> addinData ;
	private ArrayList<E> deleteData;
	private ArrayList<E> searchData;
	Random coin = new Random();
	public SkipListThread (SkipList<E> temp, ArrayList<E> add , ArrayList<E> delete, ArrayList<E> search)
	{
		this.addinData = add;
		this.list = temp ; 
		this.deleteData = delete;
		this.searchData = search;

	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//ListNode<E> n1 = this.list.bottomBegin().getRight();
	   // ListNode<E> n2 = this.list.bottomBegin().getRight().getRight();
	   // ListNode<E> n3 =  this.list.bottomBegin().getRight().getRight().getRight();
	   // ListNode<E> n4 =  this.list.bottomBegin().getRight().getRight().getRight().getRight();
	  //  ListNode<E> n5 =  this.list.bottomBegin().getRight().getRight().getRight().getRight().getRight().getRight().getRight();
	  
	    int addSize = this.addinData.size()/2;
		
	    int deleteSize = this.deleteData.size()/2;
		int searchSize = this.searchData.size()/2;
		
		if(Thread.currentThread().getName().equals("t1"))
		{
			
			
			try {
				this.list.insert(this.addinData.get(0));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t2"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				this.list.insert(this.addinData.get(1));

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t2  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		if(Thread.currentThread().getName().equals("t3"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				this.list.insert(this.addinData.get(2));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t3  is suceesssssssssssssssssssssssssssssssssssssss");
		}

		if(Thread.currentThread().getName().equals("t2"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				this.list.search(this.addinData.get(0),false,0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t3  is suceesssssssssssssssssssssssssssssssssssssss");
		}
		
		if(Thread.currentThread().getName().equals("t4"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				this.list.insert(this.addinData.get(3));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		if(Thread.currentThread().getName().equals("t5"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				this.list.insert(this.addinData.get(4));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t6"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				this.list.insert(this.addinData.get(5));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t7"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				this.list.insert(this.addinData.get(6));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t8"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				this.list.insert(this.addinData.get(7));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t9"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				this.list.insert(this.addinData.get(8));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		
		if(Thread.currentThread().getName().equals("t10"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.insert(this.addinData.get(9));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		if(Thread.currentThread().getName().equals("t11"))
		{
			System.out.println("it is t 11  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.insert(this.addinData.get(10));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t11  is suceesssssssssssssssssssssssssssssssssssssss");
			list.print();
		}
		if(Thread.currentThread().getName().equals("t12"))
		{
			System.out.println("it is t 11  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.delete(this.addinData.get(2));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t11  is suceesssssssssssssssssssssssssssssssssssssss");
			list.print();
		}
		if(Thread.currentThread().getName().equals("t4"))
		{
			System.out.println("it is t 11  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.delete(this.addinData.get(4));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t11  is suceesssssssssssssssssssssssssssssssssssssss");
			list.print();
		}
		
		if(Thread.currentThread().getName().equals("t7"))
		{
			System.out.println("it is t 11  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.search(this.addinData.get(8),false , 0);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t11  is suceesssssssssssssssssssssssssssssssssssssss");
			list.print();
		}
		
		if(Thread.currentThread().getName().equals("t2"))
		{
			System.out.println("it is t 11  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				if(this.list.search(this.addinData.get(4),false,0)!=null)
				{
					System.out.println("we have found the value !!!!!!!!!!!!");
				}
				else
				{
					System.out.println("we have  not found the value !##################################");

				}
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t11  is suceesssssssssssssssssssssssssssssssssssssss");
			list.print();
		}
		
		if(Thread.currentThread().getName().equals("t1"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.insert(this.addinData.get(16));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t2"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.insert(this.addinData.get(17));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		if(Thread.currentThread().getName().equals("t3"))
		{
			System.out.println("it is XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				Thread.sleep(5);
				this.list.delete(this.addinData.get(7));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t7 delete!!!!  is suceesssssssssssssssssssssssssssssssssssssss");
		}
		//list.print();
		/*
		if(Thread.currentThread().getName().equals("t1"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.search(this.addinData.get(2));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		if(Thread.currentThread().getName().equals("t1"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.search(this.addinData.get(11));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		if(Thread.currentThread().getName().equals("t1"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.search(this.addinData.get(11));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t1"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.insert(this.addinData.get(11));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t1"))
		{
			System.out.println("it is t 10  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.insert(this.addinData.get(11));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
	/*
		if(Thread.currentThread().getName().equals("t6"))
		{
			System.out.println("it is t 6  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.delete(this.addinData.get(1));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		if(Thread.currentThread().getName().equals("t7"))
		{
			System.out.println("it is t 6  XXXXXXXXXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			try {
				//Integer addin = new Integer(180) ;
				
				this.list.delete(this.addinData.get(5));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t4  is suceesssssssssssssssssssssssssssssssssssssss");

		}
		
		
		*/
		//int sd = coin.nextInt(2);
/*
		if(sd == 0 )
		{	
			for(int i = 0; i<addSize*2;i++)
			{
				try {
					int index = this.coin.nextInt(this.addinData.size());

					this.list.insert(this.addinData.get(index));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			for ( int  i = 0 ; i < searchSize; i++)
			{
				try {
					int searchIndex = this.coin.nextInt(this.searchData.size());
					if(this.list.search(this.searchData.get(searchIndex))!=null)
					{
						System.out.println("Successful");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		else
		{
			for ( int  i = 0 ; i < searchSize; i++)
			{
				try {
					int searchIndex = this.coin.nextInt(this.searchData.size());
					if(this.list.search(this.searchData.get(searchIndex))!=null)
					{
						System.out.println(" find Successful");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i = 0; i<addSize;i++)
			{
				try {
					int index = this.coin.nextInt(this.addinData.size());

					this.list.insert(this.addinData.get(index));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		/*
		for(int i = 0 ; i<deleteSize; i++ )
		{

			try {
				int deleteIndex = this.coin.nextInt(this.deleteData.size());
				this.list.delete(this.deleteData.get(deleteIndex));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 	  
		}*/



	}



}
