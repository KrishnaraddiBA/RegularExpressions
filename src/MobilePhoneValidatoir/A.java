package MobilePhoneValidatoir;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	System.out.println("Enter the mobile number");
	Scanner scan= new Scanner(System.in);
	String str= scan.next();
	String regex="[7-9][0-9]{9}";
	if (str.matches(regex)) {
		System.out.println("valid!!!");
		
	}
	else {
		System.out.println("Invalid");
	}
}
}
