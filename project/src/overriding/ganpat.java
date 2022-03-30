package overriding;

public class ganpat extends atul {
	void atul()
	{
		System.out.println("Hi ganpat");
	}
	void atul(int a)
	{
		System.out.println("Heloo ganpat");
	}
	void atul(char b)
	{
		System.out.println("whtas up ganpat");
	}
	void atul(int a, char b)
	{
		System.out.println("Good by ganpat");
    }
	public static void main(String[] args) {
		atul x = new atul();
		x.atul();
		x.atul(5);
		x.atul('$');
		x.atul(5,'@');
		ganpat y = new ganpat();
		x.atul();
		x.atul(5);
		x.atul('$');
		x.atul(5,'@');
		
	}
}
