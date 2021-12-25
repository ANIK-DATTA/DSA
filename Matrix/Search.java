package Matrix;

public class Search {
	static void pos(int arr[][],int r,int c,int ele) {
		int i=0, j=c-1;
		while(i<r && j>=0) {
			if(arr[i][j] == ele) {
				System.out.println(i+" "+j);
				return;
			}
			else if(arr[i][j] > ele)	j--;
			else i++;
		}
		System.out.println(-1);
	}
	public static void main(String[] args) {
		int arr[][] = {	{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}	};
		int r = arr.length;
		int c = arr[0].length;
		System.out.println("Array: ");
		Matrix obj1 = new Matrix();
		obj1.print(arr, r, c);
		System.out.println();
		int ele = 5;
		pos(arr, r, c, ele);
	}

}
