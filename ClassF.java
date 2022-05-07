package Pkg1;

import java.util.Scanner;

// Armstrong number using for loop

public class ClassF {

	public static void main(String[] args) {
		int num=0,temp,res=0,a;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the num:");
		num=scn.nextInt();
		temp=num;
		for(;num!=0;num/=10)
		{
			a=num%10;
			res=res+(a*a*a);
		}
		if(num==res)
			System.out.println("\nAmstrong num");
		else
			System.out.println("\nNot Amstrong num");

	}

}
