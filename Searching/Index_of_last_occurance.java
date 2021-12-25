package searching;

public class Index_of_last_occurance {

	public static void main(String[] args) {
		int arr[]= {2,5,5,5,5,5};
		int ele = 2;
		int l=0, h=arr.length-1;
		System.out.print(index(arr,l,h,ele));
	}
	
	static int index(int arr[], int l, int h, int ele) {
		if(arr.length<1) return -1;
		while(l <= h) {
			int mid = (l+h)/2;
			if(arr[mid] == ele) {
				if(mid == arr.length-1 || arr[mid] != arr[mid+1])	return mid;
				else	l=mid+1;
			}
			else if(arr[mid] > ele) h = mid-1;
			else  l = mid+1;
			
		}
		
		return -1;
	}

}
