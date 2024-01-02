package Basic_Programs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1);
		System.out.println(num2);

		

	}

}
