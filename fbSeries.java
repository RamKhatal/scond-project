package fibonacciSeries;
import java.util.Scanner;

public class fbSeries {

	public static void main(String[] args) {
		int first=0,i,number,second=1,next;
		System.out.println("enter the no of terms");
		Scanner s1=new Scanner(System.in);
		number=s1.nextInt();
		for(i=0;i<number;i++)
		{
			if(i<=1)
			{
				next=i;
			}else
			{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.println(""+next);
		}
		

	}

}
