import java.io.*;
class Program4
{
	public static int smallestPower(int x,int y)
	{
		int res=1;
		int p=1;
		while(res<y)
		{
			res=res*x;
			p++;
		}
		return --p;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Number x and y to find smallest power of x that is greater than y=");
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		int p=smallestPower(x,y);
		System.out.println("Smallest Power="+p);
	}
}
