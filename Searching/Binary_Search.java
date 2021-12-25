package searching;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[]= {1,5,10,15,20};
		int ele = 22;
		System.out.print(bSearch(arr, ele));
		
	}
	static int bSearch (int arr[], int ele) {
		int h = arr.length-1, l =0;
		int mid;
		while(l<=h) {
			mid = (l+h)/2;
			if(arr[mid] == ele)	return mid;
			if(arr[mid] > ele) 	h= mid-1;

			if(arr[mid] < ele)	l = mid+1;
		}
		
		return -1;
	}

}
