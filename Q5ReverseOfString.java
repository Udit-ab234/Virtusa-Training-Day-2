package assignments;

import java.util.Scanner;

public class Q5ReverseOfString {
	public static void main(String args[]) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();sc.close();
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Reverse of given String is "+sb.reverse());

}}
