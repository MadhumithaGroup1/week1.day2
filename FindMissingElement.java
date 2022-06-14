package week1.day2;
import java.util.Arrays;
public class FindMissingElement {
	
	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,6,7,8};
	int length = arr.length;
	System.out.println("Given Array");
	for(int i=0;i<length;i++) {
		System.out.println(arr[i]);
	}
	Arrays.sort(arr);

	for(int i=0;i<length;i++) {
		if(arr[i]!=i+1) {
			System.out.println("Missing Element: "+(i+1));
			break;
		}
	}
	}
}
