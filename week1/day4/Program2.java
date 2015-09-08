import java.io.*;
class Car
{
	protected int speed;
	protected double regularPrice;
	protected String color;
	Car()
	{
		speed=0;
		regularPrice=0;
		color=null;
	}
	Car(int speed,double regularPrice,String color)
	{
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void setRegularPrice(int regularPrice)
	{
		this.regularPrice=regularPrice;
	}
	public void setColor(String color)
	{
		this.speed=speed;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	public String getColor()
	{
		return color;
	}
	public  double getSalePrice()
	{
		return regularPrice;
	}
	public void getDetails()
	{
		System.out.println("speed="+speed);
		System.out.println("regularPrice="+regularPrice);
		System.out.println("color="+color);
	}
};
class Truck extends Car
{
	private int weight;
	Truck()
	{
		super();
		weight=0;
	}
	Truck(int speed,double regularPrice,String color,int weight)
	{
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	public int getWeight()
	{
		return weight;
	}
	public double getSalePrice()
	{
		if(weight>2000)
		return (regularPrice*90/100);
		else
		return (regularPrice*80/100);
	}
};
class Ford extends Car
{
	private int year;
	private int manufacturerDiscount;
	Ford()
	{
		super();
		year=0;
		manufacturerDiscount=0;
	}
	Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount)
	{
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setManufacturerDiscount(int manufacturerDiscount)
	{
		this.manufacturerDiscount=manufacturerDiscount;
	}
	public int getYear()
	{
		return year;
	}
	public int getManufaturerDiscount()
	{
		return manufacturerDiscount;
	}
	public double getSalePrice()
	{
		return regularPrice-manufacturerDiscount;	
	}
};
class Sedan extends Car
{
	private int length;
	Sedan()
	{
		super();
		length=0;
	}
	Sedan(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color);
		this.length=length;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public int getLength()
	{
		return length;
	}
	public double getSalePrice()
	{
		if(length>20)
		return (regularPrice*95/100);
		else
		return (regularPrice*90/100);	
	}
				
}		
public class Program2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Car obj;
		obj=new Sedan(20,100,"read",30);
		obj.getDetails();
		System.out.println("Saleprice="+obj.getSalePrice());
		obj=new Ford(50,200,"blue",2015,50);
		obj.getDetails();
		System.out.println("Saleprice="+obj.getSalePrice());
		obj=new Ford(50,300,"green",2015,100);
		obj.getDetails();
		System.out.println("Saleprice="+obj.getSalePrice());
		obj=new Car(100,500,"white");
		obj.getDetails();
		
	}
}

