package exceptionHandling;

public class MultupleCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr1=new int[5];
			arr1[5]=30/0;
			System.out.println(arr1[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
