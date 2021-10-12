package assignments;

import java.util.Scanner;

public class Q2ReplaceFirstHalf {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();sc.close();
		StringBuffer sb=new StringBuffer(str);
		sb.replace(0,str.length()/2 ,str.substring(str.length()/2 ));
		System.out.println("Replaced String:"+sb);
		}
	

}
