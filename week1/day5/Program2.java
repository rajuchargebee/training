import java.util.*;
import java.io.*;
class Employee
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
};

class SalaryComparator implements Comparator
{  
	public int compare(Object o1,Object o2)
	{  
		Employee e1=(Employee)o1;  
		Employee e2=(Employee)o2;  
  		if(e1.getSalary()==e2.getSalary())  
			return 0;  
		else if(e1.getSalary()>e2.getSalary())  
			return 1;  
		else  
			return -1;
	}  
};
class AgeComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;  
		Employee e2=(Employee)o2;  
  		if(e1.getAge()==e2.getAge())  
			return 0;  
		else if(e1.getAge()>e2.getAge())  
			return 1;  
		else  
			return -1;
	}  
};
class NameComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.getName().compareTo(e2.getName());
	}
}
class Program2
{
	public static void main(String args[])throws IOException
	{
		ArrayList employees=new ArrayList<Employee>();
		employees.add(new Employee("ramu",50000,20));
		employees.add(new Employee("aman",40000,25));
		employees.add(new Employee("gokul",60000,19));
		
		Iterator it=null;
		System.out.println("Sorted based on name=");
		Collections.sort(employees,new NameComparator());
		it=employees.iterator();
		while(it.hasNext())
		{
			Employee obj=(Employee)it.next();
			obj.getDetails();
		}
		System.out.println("Sorted based on Age=");
		Collections.sort(employees,new AgeComparator());
		it=employees.iterator();
		while(it.hasNext())
		{
			Employee obj=(Employee)it.next();
			obj.getDetails();
		}
		System.out.println("Sorted based on Salary=");
		Collections.sort(employees,new SalaryComparator());
		it=employees.iterator();
		while(it.hasNext())
		{
			Employee obj=(Employee)it.next();
			obj.getDetails();
		}
	}
}	

