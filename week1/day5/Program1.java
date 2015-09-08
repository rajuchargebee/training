import java.io.*;
class Mobile
{
	interface Member
	{
		//public final String name="";
		//int remainingCharge=0;
		public abstract void name();
		public void remainingCharge();
	}
	public void listOfMobile()
	{
		Member samsung=new Member(){
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
		
		Member nokia=new Member()
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
		
		Member motog=new Member()
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
};
class Program1
{
	public static void main(String args[])throws IOException
	{
		Mobile mobile=new Mobile();
		mobile.listOfMobile();
	}
}
