public class quickSort
{
	public static void main(String[] args)
	{
		int[] a = {5,4,6,3};

		// Before Sort
		System.out.println("BEFORE SORT");
		for(int i = 0 ; i < a.length ; i++)
			System.out.print(" "+a[i]);
		System.out.println();

		quickSort(a, 0, a.length - 1);

		System.out.println("---------------------------");
		System.out.println("AFTER SORT");
		for(int i = 0 ; i < a.length ; i++)
			System.out.print(" "+a[i]);
		System.out.println();
	}

	public static void quickSort(int[] a, int p, int q)
	{
		int pivot  = a[p];
		int i = p;

		for( int j = p+1 ; j < a.length ; j ++)
		{
			if(a[j] < pivot)
			{
				i++;
				swap(a, i, j);
			}
		}

		swap(a, p, i);

		for(int x = 0 ; x < a.length ; x++)
			System.out.print(" "+a[x]);
		System.out.println();

		// quickSort(a, p, i-1);
		// quickSort(a, i+1, q);
	}

	public static void swap(int[] a, int src1, int src2)
	{
		if(src1 == src2) return;

		int temp = src1;
		src1 = src2;
		src2 = temp;
	}

}