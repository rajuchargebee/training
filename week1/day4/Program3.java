import java.io.*;
import java.util.*;
class ServiceStation
{
	private String name,address;
	private int contact;
	ServiceStation()
	{
		name=address=null;
		contact=0;
	}
	ServiceStation(String name,String address,int contact)
	{
		this.name=name;
		this.address=address;
		this.contact=contact;
	}
	void getDetails()
	{
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("Contact="+contact);
	}
};
class Person
{
	private String emp_id;
	private String name;
	private float age;
	private int contact;
	private boolean isAEmployee;
	private boolean isACustomer;
	Person()
	{
		emp_id=name=null;
		age=0;
		contact=0;
		isAEmployee=isACustomer=false;
	}
	Person(String emp_id,String name,float age,int contact,boolean isAEmployee,boolean isACustomer)
	{
		this.emp_id=emp_id;
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.isAEmployee=isAEmployee;
		this.isACustomer=isACustomer;
	}
	void getDetails()
	{
		System.out.println("Emp_id="+emp_id);
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Contact="+contact);
		System.out.println("isAEmployee="+isAEmployee);
		System.out.println("isACustomer="+isACustomer);
	}
	public boolean isAEmployee()
	{
		return this.isAEmployee;
	}
	public boolean isACustomer()
	{
		return this.isACustomer;
	}
};
class Vehicle
{
	private String brand;
	private String color;
	private String service;
	private float service_charge;
	Vehicle()
	{
		brand=null;
		color=null;
		service=null;
		service_charge=0;
	}
	Vehicle(String brand,String color,String service,float service_charge)
	{
		this.brand=brand;
		this.color=color;
		this.service=service;
		this.service_charge=service_charge;
	}
	public void getDetails()
	{
		System.out.println("Brand="+brand);
		System.out.println("Color="+color);
		System.out.println("service="+service);
		System.out.println("service_charge="+service_charge);
	}
	public float getServiceCharge()
	{
		return service_charge;
	}
};
class Invoice
{
	private String name_of_owner;
	private ArrayList<Vehicle> aListV;
	private double totalAmount;
	private ArrayList<Person> aListP;
	Invoice()
	{
		name_of_owner=null;
		aListV=null;
		totalAmount=0;
		aListP=null;
	}
	Invoice(String n)
	{
		name_of_owner=n;
		aListV=new ArrayList<Vehicle>();
		aListP=new ArrayList<Person>();
	}
	public void addVehicle(Vehicle obj)
	{
		aListV.add(obj);
		totalAmount+=obj.getServiceCharge();
	}
	public void addPerson(Person obj)
	{
		aListP.add(obj);
	}
	public void getVehicles()
	{
		Iterator it=aListV.iterator();
		while(it.hasNext())
		{
			Vehicle obj=(Vehicle)it.next();
			obj.getDetails();
		}
	}
	public void getEmployees()
	{
		Iterator it=aListP.iterator();
		while(it.hasNext())
		{
			Person obj=(Person)it.next();
			if(obj.isAEmployee()==true)
			obj.getDetails();
		}
	}
	public void getCustomers()
	{
		Iterator it=aListP.iterator();
		while(it.hasNext())
		{
			Person obj=(Person)it.next();
			if(obj.isACustomer()==true)
			obj.getDetails();
		}
	}
	public void getDetails()
	{
		System.out.println("Name="+name_of_owner);
		System.out.println("Total Amount="+totalAmount);
	}
		
};
	
public class Program3
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ServiceStation service=new ServiceStation("abc","chennai",234567889);
		Invoice invoice=new Invoice("Ramesh");
		Person person[]=new Person[4];
		person[0]=new Person("E001","John",30,12345,true,false);
		person[1]=new Person("E002","Rahim",20,12345,false,true);
		person[2]=new Person("E003","Ravi",40,12345,true,false);
		person[3]=new Person("E004","Manish",25,12345,false,true);
		Vehicle vehicle[]=new Vehicle[3];
		vehicle[0]=new Vehicle("Mahindra","red","Car",500);
		vehicle[1]=new Vehicle("Glamber","black","Bike",200);
		vehicle[2]=new Vehicle("Mahindra","white","Bus",100);
		while(true)
		{
			System.out.println("1 for which vechile and employee/customer=");
			System.out.println("2 for deatils of ServiceStation.");
			System.out.println("3 for details of Invoice.");
			System.out.println("4 for all Vehicle details.");
			System.out.println("5 for all employees");
			System.out.println("6 for all customers");
			System.out.println("0 for exit.");
			System.out.println("Enter choice=");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:System.out.println("Enter 1 for Car,2 for Bike and 3 for Bus");
					int n=Integer.parseInt(br.readLine());
					invoice.addVehicle(vehicle[n-1]);
					System.out.println("Enter 1 for Jhon,2 for Rahim ,3 for Ravi and 4 for Manish");
					n=Integer.parseInt(br.readLine());
					invoice.addPerson(person[n-1]);
					break;
				case 2:service.getDetails();
					break;
				case 3:invoice.getDetails();
					break;
				case 4:invoice.getVehicles();
					break;
				case 5:invoice.getEmployees();
					break;
				case 6:invoice.getCustomers();
					break;
				case 0:System.exit(0);
			}
		}
							
		
	}
}
