import java.util.ArrayList;


public class test {


	public static 	SkipList<Integer> list = new SkipList<Integer>();

	public static void main (String[] args) throws Exception
	{


		list.print();

		ArrayList<Integer> addin = new ArrayList<Integer>();
		addin.add(3);
		addin.add(5);
		addin.add(9);
		addin.add(11);
		addin.add(15);
		addin.add(20);
		addin.add(25);
		addin.add(31);
		addin.add(88);
		addin.add(89);
		addin.add(92);
		addin.add(99);
		addin.add(100);
		addin.add(103);
		ArrayList<Integer> deleted = new ArrayList<Integer>();
		deleted.add(9);
		deleted.add(11);
		deleted.add(20);
		deleted.add(100);
		deleted.add(89);
		deleted.add(88);
		deleted.add(25);
		ArrayList<Integer> search = new ArrayList<Integer>();
		search.add(3);
		search.add(9);
		search.add(11);
		search.add(20);


		makeitRun(list,addin,deleted,search);
		System.out.println("start printing_____________________________");

		list.print();
		System.out.println("finish printing_____________________________"+"\n");

	}
	public static void makeitRun (SkipList<Integer> list , ArrayList<Integer> addin,ArrayList<Integer> deleted, ArrayList<Integer> search  ) throws Exception
	{

		/*for(int i = 0; i<addin.size();i++)
		{
			list.insert(addin.get(i));
		}*/
		ArrayList<Integer> addSecondTime = new ArrayList<Integer>();
		addSecondTime.add(108);
		addSecondTime.add(-2);
		addSecondTime.add(44);
		addSecondTime.add(32);
		addSecondTime.add(39);
		addSecondTime.add(201);
		addSecondTime.add(198);
		addSecondTime.add(121);
		addSecondTime.add(111);
		addSecondTime.add(191);
		addSecondTime.add(202);
		addSecondTime.add(89);
		addSecondTime.add(133);
		addSecondTime.add(134);
		addSecondTime.add(213);
		addSecondTime.add(467);
		addSecondTime.add(855);
		addSecondTime.add(899);
// 17


		System.out.println("start printing_____________________________");
		list.print();
		System.out.println("finish printing_____________________________"+"\n");
		SkipListThread<Integer> run = new SkipListThread<Integer>(list, addSecondTime, deleted, search);
		Thread t1 = new Thread(run, "t1");
		Thread t2 = new Thread(run, "t2");
		Thread t3 = new Thread(run, "t3");
		Thread t4 = new Thread(run, "t4");
		Thread t5 = new Thread(run, "t5");
		Thread t6 = new Thread(run, "t6");
		Thread t7 = new Thread(run, "t7");
		Thread t8 = new Thread(run, "t8");
		Thread t9 = new Thread(run, "t9");
		Thread t10 = new Thread(run, "t10");
		Thread t11 = new Thread(run, "t11");
		Thread t12= new Thread(run, "t12");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		t9.join();
		t10.join();
		t11.join();
		t12.join();
		list.print();
	}
}
