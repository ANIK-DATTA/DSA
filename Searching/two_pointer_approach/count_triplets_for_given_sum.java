package searching.two_pointer_approach;

public class count_triplets_for_given_sum {
	static int count(int arr[],int sum) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int l=i+1, h=arr.length-1;
			while(l<=h) {
				if(arr[l] + arr[h] == sum-arr[i]) {
					count++; l++;
				}
				else if(arr[l]+arr[h] > sum-arr[i])	h--;
				else	l++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {2,3,5,7,9,14};
		int sum = 18;
		System.out.println(count(arr,sum));
	}

}
