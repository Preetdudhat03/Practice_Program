class NewThread extends Thread{
	NewThread(){
		super("demo thread");
		System.out.println("child thread: "+ this);
		start();
	}
	public void run(){
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(this.getName() +"->" +i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("child Thread Interrupted");
		}
		System.out.println("exciting child thread");
	}
}

class ExtendThread{
	public static void main(String[] args) {
		new NewThread();
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
	}
}