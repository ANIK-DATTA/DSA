package Matrix;

public class Rotate_anti_clock_wise {

	static void naive(int arr[][], int n) {
		int r = n, c=n;
		int temp[][] = new int[r][c]; // r==c
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				temp[i][j] = arr[j][r-i-1];
			//	temp[r-j-1][i] = arr[i][j]; // anti clockwise
			//	temp[i][j] = arr[r-j-1][i];  clockwise
			}
		}
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(temp[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][] = { {1, 2, 3},
						{5, 6, 7},
						{9,10,11}   };
		
		naive(arr,arr.length);
		
		System.out.println("\nEfficient");
		rotate90(arr);
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}

			System.out.println();
		}	
		
	}
	
	static void swap(int mat[][], int i, int j)
	{
			int temp = mat[i][j];
			mat[i][j] = mat[j][i];
			mat[j][i] = temp;
	}
	
	static void swap2(int low, int high, int i, int mat[][])
	{
	    	int temp = mat[low][i];
			mat[low][i] = mat[high][i];
			mat[high][i] = temp;
	}

	static void rotate90(int mat[][])
	{
		int n = mat.length;
		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				swap(mat, i, j);
				
		for(int i = 0; i < n; i++)
		{
		    int low = 0, high = n - 1;
		    
		    while(low < high)
		    {
		        swap2(low, high, i, mat);
		        
		        low++;
		        high--;
		    }
		}
	}

}
