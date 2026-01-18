/*class NestTry
{
	public static void main(String[] args) 
	{
		try
		{
			int a  = args.length;
			int b = 42/a;
			System.out.println("a = "+a);
			try
			{
				if(a==1)
				{
					a=a/(a-a);
				}
					if(a==2)
					{
						int c[]={1};
						c[42]=99;

					}
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Divide = "+e);
			}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Divide = "+e);
		}
	}
}*/


public class NestTry {

    public static void main(String[] args) {
        try {
            // outer try block
            int a = 10;
            int b = 0;
            int c = a / b; // this will cause an ArithmeticException
            System.out.println("The result is " + c);
             try {
                // inner try block
                int[] arr = new int[5];
                arr[6] = 0; // this will cause an ArrayIndexOutOfBoundsException
                System.out.println("The array element is " + arr[6]);
            }
             catch (ArrayIndexOutOfBoundsException e1) {
                // inner catch block
                System.out.println("ArrayIndexOutOfBoundsException occurred: " + e1);
            }  
        }
       
        catch (ArithmeticException e) {
            // outer catch block
            System.out.println("ArithmeticException occurred: " + e);
           
        }
        System.out.println("End of program");
    }
}
