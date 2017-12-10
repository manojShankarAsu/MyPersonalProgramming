

public class App2SyncProblem
{
	private int count = 0;

	public synchronized void increment()
	{
		count++;
	}

	public int getCount()
	{
		return count;
	}

	public void work()
	{
		Thread t1 = new Thread(new Runnable() {
   		 public void run() {
   		 	for(int i=0;i<10000;i++){
        		increment();
   		 		}
    		}
		});

		Thread t2 = new Thread(new Runnable() {
   		 public void run() {
        		for(int i=0;i<10000;i++){
        		increment();
   		 		}
    		}
		});

		t1.start();
		t2.start();

		try{
				t1.join();
				t2.join();
		}
		catch(Exception e)
		{

		}
	}

	public static void main(String[] args) {
		App2SyncProblem app1 = new App2SyncProblem();
		// If you dont join threads , the count will be zero when you print.
		/*Becuase, two new threads will be spawned and the main thread will continue the execution and print the sysout*/

		app1.work();

		System.out.println("Count = "+app1.getCount());
	}
} 