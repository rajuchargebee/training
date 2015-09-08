import java.util.*;
import java.io.*;
class Employee
{
	private String eName;
	private char gender;
	private double taxableAmount;
	private double taxAmount;
	public Employee()
	{
		eName=null;
		gender=' ';
		taxableAmount=taxAmount=0;
	}
	public Employee(String eName,char gender,double taxableAmount)
	{
		this.eName=eName;
		this.gender=gender;
		this.taxableAmount=taxableAmount;
		if(gender=='M' || gender=='m')
		this.taxAmount=taxableAmount*20/100;
		else
		this.taxAmount=taxableAmount*10/100;
		
	}
	public void setEName(String eName)
	{
		this.eName=eName;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public void setTaxableAmount(double taxableAmount)
	{
		this.taxableAmount=taxableAmount;
	}
	public String getEName()
	{
		return this.eName;
	}
	public char getGender()
	{
		return this.gender;
	}
	public double getTaxableAmount()
	{
		return this.taxableAmount;
	}
	public double getTaxAmount()
	{
		return this.taxAmount;
	}
	public void calculateTax()
	{
		if(gender=='M' || gender=='m')
		this.taxAmount=taxableAmount*20/100;
		else
		this.taxAmount=taxableAmount*10/100;
	}
	public void details()
	{
		System.out.println("["+eName+"]["+gender+"]["+taxableAmount+"]["+taxAmount+"]");
	}

}
class Program5
{
	static ArrayList<Employee> al=new ArrayList<Employee>();
	static public void print()
	{
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Employee obj=(Employee)it.next();
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
			System.out.println("Enter 1 for Add Employee.");
			System.out.println("Enter 2 for all deatils of Employees.");
			System.out.println("Enter 0 for Exit.");
			System.out.println("Enter your choice=");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: Employee obj=new Employee();
					System.out.print("Enter Employee Name=");
					String str=br.readLine();
					obj.setEName(str);
					System.out.print("Enter Gender(M/F)=");	
					char ch=(char)br.read();
					obj.setGender(ch);
					System.out.print("Enter taxable Amount=");
					double tamount=x.nextDouble();
					obj.setTaxableAmount(tamount);
					obj.calculateTax();
					al.add(obj);
					break;
				case 2:print();
					break;
				case 0:System.exit(0);
			}
		}								
					
	}
}
			
	
