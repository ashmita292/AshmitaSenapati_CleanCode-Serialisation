package interest;

public class CI {
	CI(int p,int r,int t,int n)
	{
		double amount= p* Math.pow(1+(r/n), n*t);
		double CI= amount-p;
		System.out.println("compound interest is"+CI);	
	}	
}
