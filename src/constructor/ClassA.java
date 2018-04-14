package constructor;

public class ClassA {

	
	public ClassA() {
		
		System.out.println("Am Default Consturctor");
	}
	 
	public ClassA(String Name)
	{
		System.out.println(Name);
	}	
	 
	public ClassA(int i) 
	{
		System.out.println(i);
	}
	
	public void show() {
		
		System.out.println("Am show method");
	}


	public static void main(String[] args) {
		
		ClassA obj = new ClassA(200);
		
		obj.show();
		
	}
}
