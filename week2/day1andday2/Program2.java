import java.io.*;
import java.util.*;
class Program2
{
	HashMap<String,ArrayList<String>> hashmap;
	public void insert(String word[])
	{
		hashmap=new HashMap<String,ArrayList<String>>();
		int i;
		ArrayList<String> al;
		for(i=0;i<word.length;i++)
		{
			String key=word[i].substring(0,3);
			if(hashmap.containsKey(key))
			{
				al=hashmap.get(key);
				al.add(word[i]);
				hashmap.put(key,al);
			}
			else
			{
				al=new ArrayList<String>();
				al.add(word[i]);
				hashmap.put(key,al);
			}
		}
	}
	public void print()
	{
		System.out.println("Before Sorting");
		for(Map.Entry mp:hashmap.entrySet())
		{
			System.out.print("key="+mp.getKey()+"  values=");
			ArrayList<String> al=hashmap.get(mp.getKey());
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next().toString()+" ");
			}
			System.out.println();
		}
		System.out.println("After Sorting");
		Map<String,ArrayList<String>> hashmap1=new TreeMap<String,ArrayList<String>>(hashmap);
		for(Map.Entry mp:hashmap1.entrySet())
		{
			System.out.print("key="+mp.getKey()+"  values=");
			ArrayList<String> al=hashmap1.get(mp.getKey());
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
		String word[]={"raju","raja","lol","lolpp","loluuu","rajaram","aman","amakkk","babmm","babbb"};
		Program2 obj=new Program2();
		obj.insert(word);
		obj.print();
		
	}
}
