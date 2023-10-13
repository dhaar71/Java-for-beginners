package Basic_programs;

import java.util.Scanner;

public class primecheck {
    public static void main(String args[])	
	{	
		Scanner scan = new Scanner(System.in);
		int flag=0;
		System.out.println("Enter number: ");
		int a = scan.nextInt();
		for (int i =2; i<a;){
			if (a%i==0){
				flag=1;}
			break;
}		
		if (flag==1){
			System.out.println("Number is not Prime");}
		if (flag==0){
			System.out.println("Number is  prime");}

		
		scan.close();
	}
}
