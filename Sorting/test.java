package Sorting;

public class test {
    static void partition(int arr[], int l, int h, int p) {
    	int i=l,j=h, count=0;
    	int x = arr[p];
    	int temp[] = new int[h+1];
    	while(i!=h) {
    		if(arr[i]<arr[p])
    			temp[i++] = arr[i++];
    	
    	if(arr[i]>arr[p])
    		temp[j--] = arr[j--];
    	if(arr[i] == arr[p])
    		count++;
    	}
    	for(int k=0;k<count;k++)
    		temp[i++] = x;
    	System.out.println(i-1);
    }
	
	public static void main(String args[]) {
		int arr[] = {5,9,2,2,8,4,9};
		System.out.println("Array: ");	print(arr);
		System.out.println("Sorted: ");
		int l=0, h=arr.length-1, p=5;
		partition(arr,l,h,p);
		print(arr);
	}
	
	
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
