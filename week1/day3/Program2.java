import java.util.*;
import java.io.*;
class Animal
{
	private boolean isAPet;
	private String owner;
	static int count;
	Animal()
	{
		isAPet=false;
		owner=null;
		count++;	
	}
	public Animal(boolean isAPet,String owner)
	{
		this.isAPet=isAPet;
		this.owner=owner;
		count++;
	}
	public void setIsAPet(boolean isAPet)
	{
		this.isAPet=isAPet;
	}
	public void setOwner(String owner)
	{
		this.owner=owner;
	}
	public boolean setIsAPet()
	{
		return this.isAPet;
	}
	public String setOwner()
	{
		return this.owner;
	}
	static public void count()
	{
		System.out.println("count="+count);
	}
	public void details()
	{
		System.out.println("isAPet="+isAPet+" and owner="+owner);
	}

}
class Program2
{
	static ArrayList<Animal> al=new ArrayList<Animal>();
	static public void print()
	{
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Animal obj=(Animal)it.next();
			obj.details();
		}
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=null;
		Scanner x=new Scanner(System.in);
		while(true)	
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 1 for Add Animal.");
			System.out.println("Enter 2 for No.of Animal Created.");
			System.out.println("Enter 3 for all deatils of Animal.");
			System.out.println("Enter 0 for Exit.");
			System.out.println("Enter your choice=");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: System.out.print("Enter animal is Pet(Y/N)=");	
					char ch=(char)br.read();
					System.out.print("Enter owner of Animal=");
					String str=x.nextLine(); 
					Animal obj=new Animal();
					obj.setOwner(str);
					if(ch=='Y' || ch=='y')
					obj.setIsAPet(true);
					else
					obj.setIsAPet(false);
					al.add(obj);
					break;
				case 2:Animal.count();
					break;
				case 3:print();
					break;
				case 0:System.exit(0);
			}
		}								
					
	}
}
			
	
