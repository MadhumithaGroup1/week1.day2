package week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		//initialization of arrays and their lengths
		int[] a1= {3,2,11,4,6,7}, a2= {1,2,8,4,9,7};
		int l1=a1.length, l2=a2.length;
		
		//printing the arrays
		System.out.println("1st Array");
		for(int i=0;i<l1;i++) {
			System.out.println(a1[i]);
		}
		
		System.out.println("2nd Array");
		for(int j=0;j<l2;j++) {
			System.out.println(a2[j]);
		}
		
		//comparing to find intersecting values
		System.out.println("Intersecing values");
		for(int i=0;i<l1;i++) {
			for(int j=0;j<l2;j++) {
				if(a1[i]==a2[j])
					//printing the intersecting values
					System.out.println("a1["+i+"] = a2["+j+"] = "+a1[i]);
			}
		}
		
	}

}
