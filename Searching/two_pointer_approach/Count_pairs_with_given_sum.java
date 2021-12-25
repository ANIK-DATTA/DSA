package searching.two_pointer_approach;

public class Count_pairs_with_given_sum {
	
	static int count(int arr[], int sum) {
		int count = 0, l=0, h= arr.length-1;
		while(l<=h) {
			if(arr[l]+arr[h] == sum) {
				count++;	l++;
			}
			else if(arr[l]+arr[h] < sum)
				l++;
			else	h--;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,8,9,10};
		int sum = 11;
		System.out.println(count(arr, sum));
	}

}
