package Pkg1;

public class ClassA {

	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
			
		{
			System.out.println("======outer loop:"+i +"==========");
			for(int j=1;j<=3;j++)
			{
				System.out.println("inner loop:"+j);
			}	
		}

	}

}
