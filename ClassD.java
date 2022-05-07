package Pkg1;

import java.util.Scanner;

public class ClassD {

	public static void main(String[] args)
	{		
		
		int num,temp,res=0,rem;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the num:");
	num=scan.nextInt();
	temp=num;
	
	
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<=9;j++)
			
				while(temp!=0)
			{
				rem=temp%10;
				res=res+(rem*rem*rem);
				temp=temp/10;
			}
	
	
			
		

			if(num==res)
				System.out.println("\nAmstrong num");
			else
				System.out.println("\nNot Amstrong num");	
		}
	

	}

}
