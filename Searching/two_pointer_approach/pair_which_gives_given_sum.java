package searching.two_pointer_approach;

public class pair_which_gives_given_sum {

	public static void main(String[] args) {
		int arr[] = {2,3,7,8,9};
		int sum = 14;
		System.out.println(isPresent(arr, sum));
	}
	// time  complexity logn
	static int isPresent(int arr[], int sum) {
		int l =0, h=arr.length-1;
		if(l>h)	return -1;
		while(l<=h) {
			if(arr[l] + arr[h] == sum)
				return 1;
			else if(arr[l]+ arr[h] > sum)
				h--;
			else	l++;
		}
		return 0;
	}

}
