class Qno4 {
	public static void main(String args[]){
		int arr[] = {4,3,5,8,10,15,22,17 ,44};
		
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0; i< arr.length;i++){
			if(arr[i] % 2 ==  0){
				
				evenCount++;
			
			}
		}
		System.out.println("Even number is : " +evenCount);
		
		for(int i=0; i< arr.length;i++){
			if(arr[i] % 2 !=  0){
				
				oddCount++;
			
			}
		}
		System.out.println("Odd number is : " +oddCount);
	}


}