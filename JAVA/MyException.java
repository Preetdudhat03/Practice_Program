class MyExceptionDemo extends Exception
{
	private int detail;
	MyExceptionDemo(int a)
	{
		detail=a;
	}
	public String toString()
	{
		return "MyExceptionDemo["+detail+"]";
	}

}
class MyException
{
	static void compute(int a)throws MyExceptionDemo
	{
		System.out.println("called compute("+a+")");
		if(a>10)
		{
			throw new MyExceptionDemo(a);
		}
		System.out.println("normal Exit");
	}
	public static void main(String[] args) {
		try
		{
			compute(1);
			compute(15);
		}
		catch(MyExceptionDemo e)
		{
			System.out.println("Exception caught "+e);
		}
	}
}