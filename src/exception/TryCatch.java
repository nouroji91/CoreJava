package exception;

public class TryCatch {

	
	public static void main(String[] args) throws Exception {
		
		try 
		{
		String name[] = {"Bala","test","Fun"};
		System.out.println(name[2]);
		}
		
		catch(ArrayIndexOutOfBoundsException ex1) 
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			System.out.println("Plz enter number with in 0 to 2");
		}
		
		finally {
			System.out.println("Am finally block");
		}
	}
}
