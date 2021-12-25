package searching.two_pointer_approach;

public class triplet_which_gives_sum_x {

	
	public static void main(String[] args) {
		int arr[] = {2,3,5,7,9,14};
		int sum = 18;
		System.out.println(triplet(arr,sum));
		
	}
	static boolean triplet(int arr[], int sum) {
		
		for(int i=0;i<arr.length;i++) {
			int l = i+1, h = arr.length-1;
			while(l<=h) {
				if(arr[l]+arr[h] == sum-arr[i])	return true;
				else if(arr[l] + arr[h] > sum-arr[i])	
					h--;
				else	l++;
			}
		}
		return false;
	}

}
