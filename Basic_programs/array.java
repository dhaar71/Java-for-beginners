package Basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String args[]){
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter length of Array: ");
			int n = scan.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter elements of Array: ");
			for (int i=0;i<n;i++){
				 System.out.println("Element"+(i+1));
				 arr[i] = scan.nextInt();}
			
			int sum=0;
			for (int i=0;i<n;i++){
				 sum=sum+arr[i];}
			System.out.println("Sum of elements of array is: "+ sum);
			
			float average;
			average= sum/n;
			System.out.println("Avreage of elements of array is"+ average);

			int product=1;
			
			for (int i=0;i<n;i++){
				 product=product*arr[i];}
			System.out.println("Product of elements of array is: "+ product);
			
			
			int[] divisible = new int[n]; 
        		int countDivisible = 0; 
        
       		 	for (int i = 0; i < n; i++) {
            			if (arr[i] % 15 == 0) {
                			divisible[countDivisible] = arr[i];
                			countDivisible++;
            }
        }

        		System.out.println("Numbers divisible by 15 are: ");
        		for (int i = 0; i < countDivisible; i++) {
            				System.out.println(divisible[i]);
        }
			Arrays.sort(arr);
			System.out.println("Sorted Array is:");
			for (int i = 0; i < n; i++) {
					System.out.println(arr[i]);}

			System.out.println("Maximum number of array is: "+ arr[n-1]);
			System.out.println("Minimum number of array is: "+ arr[0]);
scan.close();
}
}
