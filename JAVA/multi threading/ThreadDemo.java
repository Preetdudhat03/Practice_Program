class ThreadDemo{
	public static void main(String[] args)
	{
		Thread t= Thread.currentThread();
		System.out.println("Current Thread = "+t);
		t.setName("My Thread");
		System.out.println("After Name Change = "+t);
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
	}
}