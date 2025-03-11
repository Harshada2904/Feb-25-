class Qno5 {
	public static void main(String args[]){
		int arr[] = {4,3,5,8,10};
		
		int sum = 0;
		int average;
		
		for(int i=0; i< arr.length;i++){
			sum = sum + arr[i];
			
		}
		average = sum /arr.length;
		System.out.println("Sum of array is: " +sum);
		System.out.println("Average of array is: " +average );

		}
	}