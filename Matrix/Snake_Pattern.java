package Matrix;

public class Snake_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		System.out.println("Array: ");
		Matrix obj = new Matrix();
		obj.print(arr,arr.length,arr[0].length);
		System.out.println("\nSnake Array:");
		for(int i=0;i<arr.length;i++) {
			if(i%2 == 0) {
				for(int j=0;j<arr[i].length;j++)
					System.out.print(arr[i][j]+" ");
			}
			else {
				for(int j=arr[i].length-1;j>=0;j--)
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
