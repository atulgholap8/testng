
public class overloading {
	static void atul()
	{
		System.out.println("Hi atul");
	}
	static void atul(int a)
	{
		System.out.println("Heloo atul");
	}
	static void atul(char b)
	{
		System.out.println("whtas up atul");
	}
	static void atul(int a, char b)
	{
		System.out.println("Good by atul");
	}
	public static void main(String[] args) {
		//overloading x = new overloading();
		overloading.atul();
		overloading.atul(5);
		overloading.atul('$');
		overloading.atul(5,'@');
		
	}




}
