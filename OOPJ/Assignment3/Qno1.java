class Qno1 {
	public static void main(String args[]){
		int arr[] = {10, 20,70, 30};
		int small = arr[0];
		int larg = arr[0];
		for(int i=1; i< arr.length;i++){
			if(arr[i] > larg){
				larg = arr[i];
				
			
			}
		}
		System.out.println("Largest number is: "+ larg);
		for(int i=1;i<arr.length;i++){
				if(arr[i] < small){
				small = arr[i];
				
			
			}
		}
		System.out.println("Smallest number is: "+ small);
		
	
	}


}