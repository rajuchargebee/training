import java.util.*;
import java.io.*;
class Employee implements Comparable
{
	private String name;
	private double salary;
	private float age;
	Employee()
	{}
	Employee(String name,double salary,float age)
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setAge(float age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public float getAge()
	{
		return age;
	}
	public void getDetails()
	{
		System.out.println("Name="+name);
		System.out.println("Salary="+salary);
		System.out.println("Age="+age);
	}
	/*public int compareTo(Object o2)
	{
		Employee e2=(Employee)o2;
		return this.name.compareTo(e2.getName());
	}*/
	public int compareTo(Object o2)
	{
		Employee e2=(Employee)o2;
		if(this.age>e2.getAge())
			return 1;
		else if(this.age<e2.getAge())
			return -1;
		else
			return 0;
	}
};

class Program2A
{
	public static void main(String args[])throws IOException
	{
		ArrayList employees=new ArrayList<Employee>();
		employees.add(new Employee("ramu",50000,20));
		employees.add(new Employee("aman",40000,25));
		employees.add(new Employee("gokul",60000,19));
		
		Iterator it=null;
		System.out.println("Sorted based on Age=");
		Collections.sort(employees);
		it=employees.iterator();
		while(it.hasNext())
		{
			Employee obj=(Employee)it.next();
			obj.getDetails();
		}
	}
}	

