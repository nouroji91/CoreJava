package loops;

public class Ifloop {

	
	
	int i=20;
	int j=30;
	
	String a="bala";
	String b="BALA"; // gettext()
	
	
	public void test() throws InterruptedException 
	{
		Thread.sleep(2000);
		if(i==j)
		{
			System.out.println("Pass");
		}else 
		{
			System.err.println("Fail");
		}
		
		Thread.sleep(2000);
		if(a.toUpperCase().equals(b))
		{
			System.out.println("Pass");
		}else 
		{
			System.err.println("Fail");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Ifloop obj = new Ifloop();
		obj.test();
		
		//Thread.sleep(5000);
		Ifloop obj1 = new Ifloop();
		
		obj1.test();
	}
}
