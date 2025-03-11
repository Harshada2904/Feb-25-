class ReverseArray{
	public static void main(String[] args){
		int a[] = {1,2,6,4,7,8};
		int low=0, high = a.length-1;
		
		System.out.println("Before Reverse an array: ");
		for(int n : a){
			System.out.print(n + " ");
		}
		
		while(low<high){
			a[high] = a[high] + a[low];
			a[low] = a[high] - a[low];
			a[high] = a[high] - a[low];
			low++;
			high--;
		}
		System.out.println("\nAfter Reverse an array: ");
		for(int n : a){
			System.out.print(n + " ");
		}
	}
}