package array.arrayRotations;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		
		int temp=0;
		int i,j;
		
		
		for(i=0;i<1;i++)
		{
			temp=arr[0];
			for(j=1;j<5;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[4]=temp;
		}
		
		System.out.println("Rotation done");
		
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
