package day16;
//Java program for implementation of Bubble Sort
public class BubbleSort
{
	public void bubbleSort(int arr[])
	{ 
		int n = arr.length; //n=6
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
			{
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				/* for debugging every move made by the algorithm
				for (int k=0; k<n; ++k)
				{
					System.out.print(arr[k]+",");
				}
					System.out.println(""); */
			}//inner for closes
	}

	/* Prints the array */
	public void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};//size=7
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
