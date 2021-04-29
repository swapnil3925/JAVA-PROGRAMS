package arrays;

public class SelectionSort {

	public static void main(String[] args) {
	
		int a[]= {5,3,2,8,9};
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			int minIdex=i;
			for(int j=1;j<n;j++)
			{
				if(a[j]<a[minIdex])
				{
					minIdex=j;
				}
				
			}
			int temp=a[i];
			a[i]=a[minIdex];
			a[minIdex]=temp;
		}
		for(int item : a)
		{
			System.out.print(item+" ");
		}
	}

}
