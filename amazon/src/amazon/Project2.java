package amazon;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		int rem, arm = 0,a,b;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter any Number");
		a = S.nextInt();
		b=a;
    for(b=a;a>0;a/=10)
    {
    	rem = a%10;
    	arm= rem+(arm*10);
    }
    /* while(a>0)//after  3rd iteration a<0 so block is closed
     {
    	rem = a%10;//1st-141%10=1,2nd=14%10=4 3Rd= 1%10=1
    	arm = rem+(arm*10);//1st=1+(0*10)=1,2nd=4+(1*10)=14, 3rd= 1+(14*10)=141
    	a = a/10;//1st=141/10=14, 2nd= 14/10=1, 3rd =1/10, 
     }*/
     if(b == arm)
     {
    	 System.out.println("Palindrom number");
     }
     else
     {
    	 System.out.println("Not Palindrom number");
	 }

	}

}
