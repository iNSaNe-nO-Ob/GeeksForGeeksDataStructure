package array.arrayRotations;

public class SortArrayWithoutNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-2, -6, -3, -8, 4, 1};
		int arr2[]=new int[arr.length];
		int i,j,min;
		int temp=0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				min=arr[i];
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[j]>0)
					{
						if(min>arr[j])
						{
							temp=min;
							min=arr[j];
							arr[j]=temp;
						}
					}
				}
				arr[i]=min;
				
			}
		}
		
		
	
		
		
		for(i=0;i<arr2.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
