package week1.day2;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		
		//initialization of array elements and other variables required 
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length=arr.length;
		
		//printing the array
		System.out.println("Given array");
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
		
		//comparing the elements with each other to find duplicates
		System.out.println("Duplicate values");
		for(int i=0;i<length;i++) {
			int count=0;
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			//printing the duplicates
			if(count>0)
				System.out.println(arr[i]);
		}
		
	}

}
