class WordCount implements Runnable
{
	Thread t;
	String name,s1 ,s2 ,s3;
	int start,end;
	WordCount(String name)
	{
		
		this.name = name;
		start = s;
		end= e;
		t= new Thread(this,name);
		t.start();
	}
	public void run(){
		try
		{
			for(int i=start;i<=end;i++)
			{
				if(i%7==0)
				{
					System.out.println(name+"->"+i);
					Thread.sleep(20);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("child Thread Interrupted");
		}
		System.out.println("exciting child thread");
	}
}

class ThreadDivide{
	public static void main(String[] args) {
		String str = "Hello Friends How are you?";
		int count = 1;
		for(int i;i<str.length();i++)
		{
			if(str.charAt(i)=='')
			{
				count++
;			}
System.out.println("Number of Words"+count)
		}
	}
}