import java.io.*;
class Program3
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number to check(even/odd)=");
		int a=Integer.parseInt(br.readLine());
		if(a%2==0)
		System.out.println("Given number "+a+" is even");
		else
		System.out.println("Given number "+a+" is odd");
	}
}
