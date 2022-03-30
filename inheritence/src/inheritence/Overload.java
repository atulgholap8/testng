package inheritence;

public class Overload {
	public void sanket()
	{
	
	System.out.println("hi sanket");
			
	}
	 public void sanket(int x)
	 {
		 System.out.println("hello sanket");
	 }
	 public void sanket(int x,char y)
	 {
		 System.out.println("how are you sanket");
	 }
	 public void sanket(char x ,int y)
	 {
		 System.out.println("what are you doing today");
	 }
	 public static void main(String[] args) {
		Overload a = new Overload();
		a.sanket();
		a.sanket(8);
		a.sanket(4,'d');
		a.sanket('f',6);
	}

}
