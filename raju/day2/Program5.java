
import java.io.*;
class Program5
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number for print Febonacci=");
		int n=Integer.parseInt(br.readLine());
		int a,b,c;
		a=0;
		b=1;
		if(n==1)
		System.out.println(a);
		if(n>1)
		System.out.print(a+" "+b+" ");
		int i=2;
		while(i<n)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		System.out.println();
	}
}
