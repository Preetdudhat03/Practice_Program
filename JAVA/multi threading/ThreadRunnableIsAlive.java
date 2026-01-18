class MyThread implements Runnable
{
	Thread t;
	String name;
	MyThread(String name){
		t = new Thread(this,"Demo Thread");
		System.out.println(t.getName() +"->" +t);
		t.start();
	}
	public void run(){
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child Thread" +i);
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

class ThreadRunnableIsAlive{
	public static void main(String[] args) {
		MyThread mthob1 = new MyThread("Thread 1");
		MyThread mthob2 = new MyThread("Thread 2");
		System.out.println("Thread 1 living Stutas"+mthob1.t.isAlive());
		System.out.println("Thread 2 living Stutas"+mthob2.t.isAlive());
		System.out.println("");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Thread 1 living Stutas"+mthob1.t.isAlive());
		System.out.println("Thread 2 living Stutas"+mthob2.t.isAlive());
		System.out.println("Exiting");
	}
}