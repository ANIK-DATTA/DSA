package searching;

public class Search_in_Sorted_Rotated_Array {

	public static void main(String[] args) {
		int arr[] = {10,12,19,25,3,7,9};
		int ele = 12;
		System.out.print(ind(arr,ele));
	}
	static int ind(int arr[], int ele) {
		int l = 0, h = arr.length-1;
		if(l>h)	return -1;
		while(l <= h){
			int mid = (l+h)/2;
			
			if(arr[mid] == ele)	return mid;
	
			else if(arr[mid] > arr[l]) {
				if(arr[mid] > ele && arr[l] <= ele) {
					h = mid-1;
				}
				else {
					l = mid+1;
				}
			}
			
			else {
				if(arr[mid] < ele && arr[h] >= ele)
					l = mid+1;
				else
					h = mid-1;
			}
		}
		return -1;
	}

}
