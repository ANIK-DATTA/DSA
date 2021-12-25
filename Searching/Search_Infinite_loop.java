package searching;

public class Search_Infinite_loop {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,7,9,12,15,16,19,22,24,28,33};
		int ele = 1;
		System.out.println("Naive Solution: "+search(arr,ele));
		System.out.println("Efficient Solution: "+eff(arr,ele));
		
	}

	static int eff(int arr[], int ele) {
		int i = 0;
		if(arr[i] == ele) return i;
		i = 1;
		while(arr[i] <= ele) {
			i *= 2; 	
		}
		if(arr[i] == ele)	return ele;
		return Binary_Search(arr,(i/2)+1,i-1,ele);
	}
	
	static int Binary_Search(int arr[], int l, int h, int ele) {
		if(l>h)	return -1;
		while(l <= h) {
			int mid = (l+h)/2;
			if(arr[mid] == ele)	return mid;
			else if(arr[mid] > ele)	h = mid-1;
			else l = mid+1;
		}
		
		return -1;
	}
	
	static int search(int arr[], int ele) {
		int i = 0;
		while(true) {
			if(arr[i] == ele)	return i;
			if(arr[i] > ele)	return -1;
			i++;
		}
		
	}
	

}
