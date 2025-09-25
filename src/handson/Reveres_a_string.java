package handson;

import java.util.Scanner;

public class Reveres_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		System.out.println("Enter the Strring");
		int len= A.length();
		for (int i=len;i>0;i--) {
			System.out.print(A.charAt(i));
		}
	}

}
