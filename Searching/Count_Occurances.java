package searching;
public class Count_Occurances {

	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1,1,1};
		int ele = 1, l = 0, h = arr.length;
		int res = count(arr, l, h,ele);
		System.out.println(res);
	}
	
	static int count(int arr[],int l,int h, int ele) {
	return Index_of_last_occurance.index(arr, l, h, ele) - Index_of_first_occurance.index(arr, l, h, ele) +1;
	}
}
