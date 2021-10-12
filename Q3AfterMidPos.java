package assignments;

import java.util.Scanner;

public class Q3AfterMidPos {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();sc.close();
		System.out.println("The String from Mid is "+str.substring((str.length()/2)));
		}
}
