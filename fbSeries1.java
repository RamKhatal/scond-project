package fibonacciSeries;

import java.util.Scanner;

public class fbSeries1 {

	public static void main(String[] args) {
		int first=0,second=1,i,number,next;
		System.out.println("enter the number of terms:");
		Scanner p1=new Scanner(System.in);
		number=p1.nextInt();
		for(i=0;i<number;i++)
		{
			if(i<=1)
			{
				next=i;
			}
			else
			{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.println(" "+next);
		}

	}

}
