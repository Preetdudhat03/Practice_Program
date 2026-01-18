
class Finally
{
	static void procA()
	{
		try{
			System.out.println("inside proc A");
			throw new RuntimeException("demo");
		}
		catch(Exception e)
		{
			System.out.println("catch Exception = "+e);
		}
		finally{
			System.out.println("proc A's finally");
		}
	}
	static void ProcB()
	{
		try{
			System.out.println("inside proc B");
			return;
		}
		finally{
			System.out.println("proc B's finally");
		}
	}
	static void ProcC()
	{
		try{
			System.out.println("inside proc C");
			return;
		}
		finally{
			System.out.println("proc C's finally");
		}
	}
	public static void main(String[] args) {
		try
		{
			procA();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		ProcB();
		ProcC();
	}
}