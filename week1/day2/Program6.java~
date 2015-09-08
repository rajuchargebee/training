import java.io.*;
class Program6
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many Number you want to Enter=");
		int n=Integer.parseInt(br.readLine());
		Integer arr[]=new Integer[n];
		int max,min,i;
		max=min=0;
		for(i=0;i<n;i++)
		{
			System.out.print("Enter value for arr["+i+"]=");
			arr[i]=Integer.parseInt(br.readLine());
			if(i==0)
			min=max=arr[i];
			if(arr[i]<min)
			min=arr[i];
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.println("Minimum value="+min);
		System.out.println("Maximum value="+max);
		
		
	}
}
