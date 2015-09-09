import java.io.*;
import java.util.*;
class Factorial
{
	private int lowerLimit;
	private int upperLimit;
	Factorial(int lowerLimit,int upperLimit)
	{
	     this.lowerLimit=lowerLimit;
	     this.upperLimit=upperLimit;
      	}
   	public String toString()
    	{
       		String result="\"";
        	Iterator<Integer> it=this.iterator();
        	//MyIterator it=new MyIterator();
          	int f=1;
         	while(it.hasNext())
          	{
           		if(f==1)
              		{
              			result=result+it.next();
               			f=0;
               		}
           		else
            			result=result+","+it.next();
          	}
           	result=result+"\" ";
     		return result;
      	}


   public Iterator<Integer> iterator() {

    return new Iterator<Integer>() {
      
      int pos = lowerLimit;

      public boolean hasNext() {
        return pos <=upperLimit;
      }

      public Integer next() {
            int i=2,f=1;
             while(i<=pos)
                {
                 f=f*i;
                  i++;
                }
                pos++;
            return f;
            
        }

    //  public void remove() {
      //  throw new UnsupportedOperationException();
      };
    }
    class MyIterator implements Iterator
    {
	int pos ;
       	MyIterator()
        {
            pos=lowerLimit;
        }
      	public boolean hasNext() 
	{
	        return pos <=upperLimit;
        }
        public Integer next() 
	{
            int i=2,f=1;
             while(i<=pos)
             {
                 f=f*i;
                  i++;
             }
                pos++;
            return f;
            
        }
    }
    public static void main(String ar[])
    {
      Factorial f=new Factorial(2,6);
      System.out.println(f.toString());
    }
}

