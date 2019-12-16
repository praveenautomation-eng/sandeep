package com.Praveen;

public class A
{
	public static void main(String[] args) {
		
		int i=2,n=23;
		boolean f=false;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=true;
				
				break;
			}
		}	
			 
			 if(!f)
				 System.out.println(n+"is a prime number");
			 else
				 System.out.println(n+"is not a prime number");
		}
		
}


