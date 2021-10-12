package assignments;

import java.util.Scanner;

public class Q8HashcodesOfDiffStrings {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();sc.close();
		System.out.print("The Hashcode of given String:"+s.hashCode());
	}

}
