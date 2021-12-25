package Matrix;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Matrix{
	void print(int arr[][], int r, int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}