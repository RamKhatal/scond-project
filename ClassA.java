package Pkg1;

public class ClassA {
	int a;
	String b;
	public ClassA(int a,String b)      // constructor overloading
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	public ClassA(String a,int b)    // constructor overloading
	{
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		new ClassA(10,"velo");
		new ClassA(12,"ram");

	}


}
