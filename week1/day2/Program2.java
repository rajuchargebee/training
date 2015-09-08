import java.io.*;
class Program2
{
	public static void print(Integer mat[][],int m,int n)
	{
		int i,j;
		for(i=0;i<m;i++)
		{
			System.out.println();
			for(j=0;j<n;j++)
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	public static void transpose(Integer mat[][],int m,int n)
	{
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i<j)
				{
					int t=mat[i][j];
					mat[i][j]=mat[j][i];
					mat[j][i]=t;
				}
			}
		}
	}
	public static void leftRotate(Integer mat[][],int m,int n)
	{
		int r1=0,r2=m-1,i;
		while(r1<r2)
		{
			for(i=0;i<n;i++)
			{
				int t=mat[r1][i];
				mat[r1][i]=mat[r2][i];
				mat[r2][i]=t;
			}
			r1++;
			r2--;
		}
	}
	public static void rightRotate(Integer mat[][],int m,int n)
	{
		int c1=0,c2=n-1,i;
		while(c1<c2)
		{
			for(i=0;i<m;i++)
			{
				int t=mat[i][c1];
				mat[i][c1]=mat[i][c2];
				mat[i][c2]=t;
			}
			c1++;
			c2--;
		}
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter dimension of matrix="); 
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		Integer mat[][]=new Integer[m][n];
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter value for arr["+i+"]["+j+"]=");
				mat[i][j]=Integer.parseInt(br.readLine());
			}
		}
		while(true)
		{
			System.out.println("\n\nEnter 1 for Left Rotation.");
			System.out.println("Enter 2 for Right Rotation.");
			System.out.println("Enter 3 for print Given Matrix=");
			System.out.println("Enter 0 for Exit.");
			System.out.print("Enter Your Choice=");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:transpose(mat,m,n);
					leftRotate(mat,m,n);
					System.out.println("Left Rotation of give matrix=");
					print(mat,m,n);
					transpose(mat,m,n);
					rightRotate(mat,m,n);
					break;
				case 2:transpose(mat,m,n);
					rightRotate(mat,m,n);
					System.out.println("Right Rotation of give matrix=");
					print(mat,m,n);
					transpose(mat,m,n);
					leftRotate(mat,m,n);
					break;
				case 3:print(mat,m,n);
					break;
				case 0:System.exit(0);
			}
		}
									
		
	}
}
