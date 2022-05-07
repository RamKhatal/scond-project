package Pkg1;

public class ClassB {
	int a=12;
	int b=13;
	String c="Ram";
	static char d='@';
	static boolean f=true;
	public ClassB(int a)
	{
		a=a;
	}
	public ClassB()
	{
		
	}

	public static void main(String[] args) 
	{
		ClassB k=new ClassB();
		ClassB kk=new ClassB(15);
		System.out.println(k.a);
		System.out.println(kk.b);
		System.out.println(k.c);
		k.m1();
		m3();

	}
	public void m1()
	{
	System.out.println(a);
	}
	public void m2()
	{
		System.out.println(c);
	}
	public static void m3()
	{
		ClassB k = new ClassB();
		System.out.println(d);
	}
}
