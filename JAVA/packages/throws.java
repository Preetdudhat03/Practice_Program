/*import java.io.*;

class Throws
{
	static void demoproc() {
		try
		{
			throw new IOException("demo");
		}
		catch(IOException e)
		{
			System.out.println("Caught inside demoproc");
		}
	}
	public static void main(String[] args) {
		try{
			demoproc();

		}
		catch(IOException e)
		{
			System.out.println("Recaught = "+e);
		}
	}
}*/

/*
import java.io.*;

class Throws
{
	static void demoproc() {
		try
		{
			throw new IOException("demo");
		}
		catch(IOException e) // changed from NullPointerException
		{
			System.out.println("Caught inside demoproc");
		}
	}
	public static void main(String[] args) {
		try{
			demoproc();

		}
		catch(IOException e)
		{
			System.out.println("Recaught = "+e);
		}
	}
}*/


/*import java.io.*;

class Throws
{
	static void demoproc() {
		try
		{
			throw new NullPointerException("demo"); // changed from IOException
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside demoproc");
		}
	}
	public static void main(String[] args) {
		try{
			demoproc();

		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught = "+e);
		}
	}
}
*/


class Throws{
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("inside throw One");
		throw new IllegalAccessException("demo");
	}
	public static void main(String[] args) {
		try{
			throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught = "+e);
		}
	}
}