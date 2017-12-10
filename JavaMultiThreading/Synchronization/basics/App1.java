import java.util.Scanner;
class Processor extends Thread
{

	private volatile boolean running = true;
	
	public void run()
	{

		try
		{
			while(running)
			{
				System.out.println("\n Hi");
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{

		}
	}

	public void shutdown()
	{
		running = false;
	}
}


public class App1
{
	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();

		Scanner s = new Scanner(System.in);
		s.nextLine();
		p1.shutdown();
	}
}