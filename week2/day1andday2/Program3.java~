import java.io.*;
import java.util.*;
class Phone
{
	private String name;
	private String number;
	Phone(String name,String number)
	{
		this.name=name;
		this.number=number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNumber(String number)
	{
		this.number=number;
	}
	public String getName()
	{
		return this.name;
	}
	public String getNumber()
	{
		return this.number;
	}
};
class Person
{
	private String name;
	private String address;
	private ArrayList<Phone> phone;
	Person()
	{
		phone=new ArrayList<Phone>();
	}
	Person(String name,String address,Phone phone)
	{
		this.name=name;
		this.address=address;
		this.phone=new ArrayList<Phone>();
		this.phone.add(phone);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void addPhone(Phone phone)
	{
		this.phone.add(phone);
	}
	public String getName()
	{
		return this.name;
	}
	public String getAddress()
	{
		return this.address;
	}
	public ArrayList<Phone> getPhones()
	{
		return this.phone;
	}
};
class Program3
{
	HashMap<Integer,ArrayList<Person>> hashmap=new HashMap<Integer,ArrayList<Person>>();;
	public void insert(Person person)
	{
		int i;
		ArrayList<Person> al;
		if(hashmap.containsKey(person.getName().length()))
		{
			al=hashmap.get(person.getName().length());
			al.add(person);
			hashmap.put(person.getName().length(),al);
		}
		else
		{
			al=new ArrayList<Person>();
			al.add(person);
			hashmap.put(person.getName().length(),al);
		}
	}
	public void print()
	{
		for(Map.Entry mp:hashmap.entrySet())
		{
			System.out.println("Key="+mp.getKey());
			ArrayList<Person> al=hashmap.get(mp.getKey());
			Iterator it=al.iterator();
			Iterator it1;
			while(it.hasNext())
			{
				Person person=(Person)it.next();
				System.out.println("Name="+person.getName());
				System.out.println("Address="+person.getAddress());
				it1=person.getPhones().iterator();
				while(it1.hasNext())
				{
					Phone phone=(Phone)it1.next();
					System.out.println(phone.getName()+" ::"+phone.getNumber());
				}
			}
			System.out.println();
		}
	}
	public void printByName(String name)
	{
		for(Map.Entry mp:hashmap.entrySet())
		{
			if(name.length()==(Integer)mp.getKey())
			{
				ArrayList<Person> al=hashmap.get(mp.getKey());
				Iterator it=al.iterator();
				Iterator it1;
				while(it.hasNext())
				{
					Person person=(Person)it.next();
					if(person.getName().equals(name))
					{
						System.out.println("Name="+person.getName());
						System.out.println("Address="+person.getAddress());
						it1=person.getPhones().iterator();
						while(it1.hasNext())
						{
							Phone phone=(Phone)it1.next();
							System.out.println(phone.getName()+" ::"+phone.getNumber());
						}
					}
				}	
				System.out.println();
			}
		}
	}
	public void printByPartialName(String name)
	{
		for(Map.Entry mp:hashmap.entrySet())
		{
			
				ArrayList<Person> al=hashmap.get(mp.getKey());
				Iterator it=al.iterator();
				Iterator it1;
				while(it.hasNext())
				{
					Person person=(Person)it.next();
					if(person.getName().contains(name))
					{
						System.out.println("Name="+person.getName());
						System.out.println("Address="+person.getAddress());
						it1=person.getPhones().iterator();
						while(it1.hasNext())
						{
							Phone phone=(Phone)it1.next();
							System.out.println(phone.getName()+" ::"+phone.getNumber());
						}
					}
				}	
				System.out.println();
		}
	}
	public void printByPhone(String number)
	{
		for(Map.Entry mp:hashmap.entrySet())
		{
				ArrayList<Person> al=hashmap.get(mp.getKey());
				Iterator it=al.iterator();
				Iterator it1;
				while(it.hasNext())
				{
					boolean flag=false;
					Person person=(Person)it.next();
					it1=person.getPhones().iterator();
					while(it1.hasNext())
					{
						Phone phone=(Phone)it1.next();
						if(phone.getNumber().equals(number))
						{
							flag=true;
							break;
						}
					}
						
					if(flag)
					{
						System.out.println("Name="+person.getName());
						System.out.println("Address="+person.getAddress());
						it1=person.getPhones().iterator();
						while(it1.hasNext())
						{
							Phone phone=(Phone)it1.next();
							System.out.println(phone.getName()+" ::"+phone.getNumber());
						}
					}
					System.out.println();
				}	
		}

	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Program3 obj=new Program3();

		Person person1=new Person("raju","chennai",new Phone("mobile","7890675645"));
		person1.addPhone(new Phone("home","567899"));
		person1.addPhone(new Phone("work","8909786754"));
		obj.insert(person1);


		Person person2=new Person("aman kumar","chennai",new Phone("mobile","7890675645"));
		person2.addPhone(new Phone("home","567899"));
		person2.addPhone(new Phone("work","8909786754"));
		obj.insert(person2);

		Person person3=new Person("gopal","chennai",new Phone("mobile","7845388983"));
		person3.addPhone(new Phone("home","567899"));
		person3.addPhone(new Phone("work","8909786754"));
		obj.insert(person3);

		Person person4=new Person("gopal","chennai",new Phone("mobile","7890675645"));
		person4.addPhone(new Phone("home","567899"));
		person4.addPhone(new Phone("work","8909786754"));
		obj.insert(person4);

		Person person5=new Person("aman","chennai",new Phone("mobile","7845388983"));
		person5.addPhone(new Phone("home","567899"));
		person5.addPhone(new Phone("work","8909786754"));
		obj.insert(person5);

		Person person6=new Person("raju ranjan kumar","chennai",new Phone("mobile","7890675645"));
		person6.addPhone(new Phone("home","567899"));
		person6.addPhone(new Phone("work","8909786754"));
		obj.insert(person6);

		Person person7=new Person("rajaram","chennai",new Phone("mobile","7890675645"));
		person7.addPhone(new Phone("home","567899"));
		person7.addPhone(new Phone("work","8909786754"));
		obj.insert(person7);

		String name=null,phone=null;
		int choice=0;
		do
		{
			System.out.println("1.for view all Records");
			System.out.println("2.for view by given Name");
			System.out.println("3.for view records partial match by given Name");
			System.out.println("4.for view record by given Phone");
			System.out.println("0.for Exit");
			System.out.print("Enter Choice=");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:obj.print();	
					break;
				case 2: System.out.print("Enter name=");
					name=br.readLine();
					obj.printByName(name);
					break;
				case 3: System.out.print("Enter name=");
					name=br.readLine();
					obj.printByPartialName(name);
					break;
				case 4:System.out.print("Enter phone=");
					phone=br.readLine();
					obj.printByPhone(phone);
					break;
			}
		}while(choice!=0);
		
	}
}
