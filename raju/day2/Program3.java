import java.io.*;
class Program3
{
	public static int getIndex(char ch)
	{
		String str1="abcdefghijklmnopqrstuvwxyz";
		String str2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int i;
		for(i=0;i<26;i++)
		{
			if(ch==str1.charAt(i) || ch==str2.charAt(i))
			return i+1;
		}
		return 0;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String=");
		String str=br.readLine();
		int len=str.length(),i;
		int sum=0;
		String res="";
		for(i=0;i<len;i++)
		{
			sum+=getIndex(str.charAt(i));
			if(res=="")
			res=res+getIndex(str.charAt(i));
			else
			res=res+"+"+getIndex(str.charAt(i));
		}
		if(sum%2==0)
			System.out.println("even("+res+")="+sum);
		else
			System.out.println("odd("+res+")="+sum);
		
	}
}
