import java.io.*;
class Program4
{
	public static float pow(float a,float b)
	{
		int p=1;
		float res=1;
		while(p<=b)
		{
			res*=a;
			p++;
		}
		return res;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter value for Principle=");
		float p=Float.parseFloat(br.readLine());
		System.out.print("Enter value for Rate=");
		float r=Float.parseFloat(br.readLine());
		System.out.print("Enter value for Time=");
		float t=Float.parseFloat(br.readLine());
		float si=(p*r*t)/100;
		float ci=p*pow((1+(r/100)),t)-p;
		System.out.println("Simple Interest="+si);
		System.out.println("Compound Interest="+ci);
	}
}
