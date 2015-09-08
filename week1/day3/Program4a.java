import java.io.*;
class AccessModifierDemo//public-ERROR private & protected (only for inner calss)-Not allowed
{
	private int a;
	public int b;
	int c;//default
	public AccessModifierDemo()
	{
		a=b=c=0;
	}
	private void  display1()
	{
		System.out.println("Private Method Called\nvalues of a="+a+" b="+b+" and c="+c);
	}
	void  display2()
	{
		System.out.println("Default Method Called\nvalues of a="+a+" b="+b+" and c="+c);
	}
	protected void  display3()
	{
		System.out.println("Protected Method Called\nvalues of a="+a+" b="+b+" and c="+c);
	}
	public void  display4()
	{
		display1();
		System.out.println("Public Method Called\nvalues of a="+a+" b="+b+" and c="+c);
	}
}
class Program4
{
	public static void main(String args[])
	{
		AccessModifierDemo obj=new AccessModifierDemo();
		//obj.display1(); //ERROR	
		obj.display2();	
		obj.display3();	
		//obj.a=10;  //ERROR
		obj.b=20;
		obj.c=30;
		obj.display4();	
	}
}

