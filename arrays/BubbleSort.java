package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=a.length;
		int temp;
		for(int i=0;i<n-1;i++)
		{
			boolean sorted=true;
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
//		//for(int i=0;i<n;i++)
//		//{
//			for(int j=0;j<n;j++)
//			{
//				System.out.print(a[j]+" ");
//			}
//		//}
		for(int item: a)
		{
			System.out.print(item+" ");
		}
	}

}
