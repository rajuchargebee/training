import java.io.*;
class Mobile
{
	private String name;
	private int remainingCharge;
	Mobile(){}
	Mobile(String name,int remainCharge)
	{
		this.name=name;
		this.remainingCharge=remainingCharge;
	}
	public void name()
	{
		System.out.println("Mobile name="+name);
	}
	public void remainingCharge()
	{
		System.out.println("Remaining Charge="+remainingCharge);
	}
};
class Program1
{
	public static void main(String args[])throws IOException
	{
		Mobile samsung=new Mobile()
		{
			String name="Samsung";
			int remainingCharge=100;
			public void name()
			{
				System.out.println("Mobile name="+name);
			}
			public void remainingCharge()
			{
				System.out.println("Remaining Charge="+remainingCharge);
			}
		};
		Mobile nokia=new Mobile()
		{
			String name="Nokia";
			int remainingCharge=50;
			public void name()
			{
				System.out.println("Mobile name="+name);
			}
			public void remainingCharge()
			{
				System.out.println("Remaining Charge="+remainingCharge);
			}
		};
		
		Mobile motog=new Mobile()
		{
			String name="Motog";
			int remainingCharge=75;
			public void name()
			{
				System.out.println("Mobile name="+name);
			}
			public void remainingCharge()
			{
				System.out.println("Remaining Charge="+remainingCharge);
			}
		};


		samsung.name();
		samsung.remainingCharge();
		nokia.name();
		nokia.remainingCharge();
		motog.name();
		motog.remainingCharge();		
	}
}
