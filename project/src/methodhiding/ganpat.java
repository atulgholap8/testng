package methodhiding;

import overriding.atul;


public class ganpat {
	   static void atul()
		{
			System.out.println("Hi ganpat");
		}
		 static void atul(int a)
		{
			System.out.println("Heloo ganpat");
		}
		 static void atul(char b)
		{
			System.out.println("whtas upganpat");
		}
		 static void atul(int a, char b)
		{
			System.out.println("Good by ganpat");
	    }
		 public static void main(String[] args) {
			ganpat.atul();
			ganpat.atul(6);
			ganpat.atul('$');
			ganpat.atul(6, '$'); 
			
			
		}
	}


