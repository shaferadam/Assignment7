// I have Jenkins set to look for changes every minute on GitHub. 
// I included a comment so that Jenkins would rebuild after I push to Github due to this change.

package com.CEN4028.web;

public class Fibonacci
{
	public long FibSeq[] = new long[500];
		
	public Fibonacci(){	}
		
	public long fibonacci(int n)
	{		
		long F_n1=0;
		long F_n2=0;
						
		if(n == 0 || n ==1)
		{
			return n;
		}
	
		if( FibSeq[n-1] != 0 )
		{
			F_n1 = FibSeq[n-1];
		}
		else
		{
			F_n1 = fibonacci(n-1);			
			FibSeq[n-1] = F_n1;
		}
				
		if( FibSeq[n-2] != 0 )
		{
			F_n2 = FibSeq[n-2];
		}
		
		else
		{
			F_n2 = fibonacci(n-2);			
			FibSeq[n-2] = F_n2;
		}
			return F_n1 + F_n2;
	}
			
}
