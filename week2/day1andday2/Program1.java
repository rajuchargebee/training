import java.io.*;
import java.util.*;
class Program1
{
	HashMap<Integer,ArrayList<String>> hashmap;
	public void insert(String word[])
	{
		hashmap=new HashMap<Integer,ArrayList<String>>();
		int i;
		ArrayList<String> al;
		for(i=0;i<word.length;i++)
		{
			if(hashmap.containsKey(word[i].length()))
			{
				al=hashmap.get(word[i].length());
				al.add(word[i]);
				hashmap.put(word[i].length(),al);
			}
			else
			{
				al=new ArrayList<String>();
				al.add(word[i]);
				hashmap.put(word[i].length(),al);
			}
		}
	}
	public void print()
	{
		for(Map.Entry mp:hashmap.entrySet())
		{
			System.out.print(mp.getKey()+" ");
			ArrayList<String> al=hashmap.get(mp.getKey());
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next().toString()+" ");
			}
			System.out.println();
		}
	}

	public static void main(String args[])throws IOException
	{
		String word[]={"aman","raju","kumar","chargebee","india","Chennai","Mumbai","delhi","kolkata"};
		Program1 obj=new Program1();
		obj.insert(word);
		obj.print();
		
	}
}
