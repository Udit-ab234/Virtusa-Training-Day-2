package assignments;

import java.util.Scanner;

public class Q1UptoMidPos {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();sc.close();
		if(str.length()%2==0)
		System.out.println("The String Upto Mid is "+str.substring(0,str.length()/2 ));
		else System.out.println("The String Upto Mid is "+str.substring(0,str.length()/2 +1));
		}

}
