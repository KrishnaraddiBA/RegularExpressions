package NameValidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//name validator developed using regular expression
public class A {
	public static void main(String[] args) {
		System.out.println("Enter the name ");
		Scanner scan= new Scanner(System.in);
		String x= scan.next();
		int count=0;
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher(x);
		while(m.find()) {
			count++;
		}
		if (count!=0&&x.length()<3) {
			System.out.println("Error");
			
		}
		else {
			System.out.println("InputAccepted!!!");
		}
	}

}
