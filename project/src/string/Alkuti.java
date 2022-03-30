package string;

public class Alkuti {
public static void main(String[] args) {
	String b = "  My name is Atul  ";
	String C = "My name is chetan";
	String d;
	System.out.println(b.replace("Atul","chetan"));
	// This method is used to replace the Character or complete word in a string
	System.out.println(b.replace("M","K"));//It is a case sensitive
	System.out.println("--------------");
	System.out.println(b.startsWith("My"));
	//This method is used when we know first word of string and with the help of that we find the string
	System.out.println("---------------------");
	System.out.println(b.endsWith("Atul"));
	//This method is used to find the string when we know last word of string
	System.out.println("---------------");
	System.out.println(b);
	System.out.println( b.trim()  );
	// this method is used to remove space only which are in starts and end not in between two words
	System.out.println("-----------------------------");
	String [] x = C.split("name");// this method used to split the string. So this method gives the two more string
	// for that we array of string to store multiple string
	for(int i = 0; i < x.length; i++)
	System.out.println(x[i]);
	System.out.println("-----------");
	 d = "velocity class";
	 char [] y = d.toCharArray();// this method used separate the each character in a string
		for(int i = 0; i < y.length; i++)
			System.out.println(y[i]);
		System.out.println("------------------------------");
		b= "velocityavh";
		C= "velocitya";// this method is used to compare the two string
		System.out.println(b.compareTo(C));
		
	
}
}
