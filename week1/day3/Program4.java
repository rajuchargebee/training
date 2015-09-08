import java.util.*;
import java.io.*;
class Author
{
	private String name;
	private String email;
	private char gender;
	Author()
	{}
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toDisplay()
	{
		return "["+name+"][("+gender+")] at ["+email+"]";
	}
};
class Book
{
	private String name;
	private ArrayList<Author> authors;
	private double price;
	private int qtyInStock;
	Book()
	{	
	}
	Book(String name,Author author,double price,int qtyInStock)
	{
		authors=new ArrayList<Author>();
		this.name=name;
		authors.add(author);
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	Book(String name,Author author[],double price,int qtyInStock)
	{
		this.name=name;
		int i=0;
		while(i<author.length)
		{
			authors.add(author[i]);
		}
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock=qtyInStock;
	}
	public String getName()
	{
		return name;
	}
	public ArrayList<Author> getAuthors()
	{
		return authors;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	public String toDisplay()
	{
		String result=null;
		result="["+name+"] by";
		Iterator it=authors.iterator();
		while(it.hasNext())
		{
			Author author=(Author)it.next();
			result+=" \n"+author.getName()+" ("+author.getGender()+") at "+author.getEmail()+" ,";
		}
		result+="\n Price=$"+price;
		result+="\n No.of books Available:"+qtyInStock;
		return result;
	}
	public void addAuthor(Author author)
	{
		authors.add(author);
	}
	public void printAuthor()
	{
		Iterator it=authors.iterator();
		while(it.hasNext())
		{
			Author author=(Author)it.next();
			System.out.println(author.toDisplay());
		}
	}
};
		
class Program4
{
	public static void main(String args[])
	{
			
		Author author=new Author("R.K. Narayan", "rknarayan@gmail.com",'M');
		System.out.println(author.toDisplay());
		author.setEmail("rknarayan@hotmail.com");
		System.out.println(author.toDisplay());
		Book book1=new Book("c",author,250,20);
		System.out.println("Book Details=\n"+book1.toDisplay());
		Author author1=new Author("E Bala", "ebala@gmail.com",'M');
		book1.addAuthor(author1);
		System.out.println("Book Details=\n"+book1.toDisplay());
		book1.printAuthor();


	}
}

