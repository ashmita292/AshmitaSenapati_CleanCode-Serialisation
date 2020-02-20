package interest;

import java.io.IOException;
import java.util.Scanner;


public class MAIN {
	public static void main(String[] args) throws IOException{
		   
		   Scanner s=new Scanner(System.in);
		   System.out.write("Enter the principal(p)\n".getBytes());
		   int p=s.nextInt();
		   System.out.write("Enter the rate of interest(r)\n".getBytes());
		   int r=s.nextInt();
		   System.out.write("Enter the time(t)\n".getBytes());
		   int t=s.nextInt();
		  SI si=new SI(p,r,t);
		  System.out.write("Enter the number of times the interest is compounded\n".getBytes());
		   int n=s.nextInt();
		   
		  CI ci=new CI(p,r,t,n);  
	   }

}
