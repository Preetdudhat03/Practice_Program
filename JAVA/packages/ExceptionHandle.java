class ExceptionHandle{
	public static void main(String[] args) {
		System.out.println("Start");
		int d = 0;
		try
		{
			int a = 67/d;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divisor cannot be 0");
		}
		System.out.println("End");
	}
}