class Throw
{
	static void demoproc() {
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside demoproc");
		}
	}
	public static void main(String[] args) {
		demoproc();
	}
}