class Runner implements Runnable
{
	public void run()
	{
		try{

			for (int i=0; i<20;i++ ) {
				System.out.println(Thread.currentThread().getId()+" : "+i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{

		}
	}
}

public class App2 
{
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		t1.start();


		Thread t2 = new Thread(new Runner());
		t2.start();
	}
}