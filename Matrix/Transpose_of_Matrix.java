package Matrix;

public class Transpose_of_Matrix {
	static void swap(int arr[][], int i, int j) {
		int temp=arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}
	public static void main(String[] args) {
		int arr[][] = { {1, 2, 3},
						{5, 6, 7},
						{9,10,11}   };
		//
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++)
				swap(arr,i,j);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		//
//		int b[][]= new int[arr[0].length][arr.length];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++)
//				b[i][j] = arr[j][i];
//		}
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<b[0].length;j++)
//				System.out.print(b[i][j]+" ");
//		System.out.println();
//		}
	}
		
	

}
