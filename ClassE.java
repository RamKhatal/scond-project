package Pkg1;
//star pattern

public class ClassE {
	

	public static void main(String[] args) {
		ClassE k=new ClassE();
		for(int i=1;i<5;i++)
		{
		
			k.dimanod();
		}
		
	}
		
		public void dimanod()
		{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}


