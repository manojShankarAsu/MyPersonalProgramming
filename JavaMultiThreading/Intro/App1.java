class Runner extends Thread
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

public class App1
{


	public static void main(String[] args) {
		Runner r1 = new Runner();
		r1.start();	

		Runner r2 = new Runner();
		r2.start();	

		Runner r3 = new Runner();
		r3.start();	

	}
}