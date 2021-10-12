package assignments;

import java.util.Scanner;

public class Q4Swap2ConsecutiveChars {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();sc.close();
	    String output = "";
	    for (int i = 0; i < str.length(); i++) {
	      if (i + 3 < str.length()) {
	        output = output + str.charAt(i + 2)+str.charAt(i+3);
	        output = output + str.charAt(i)+str.charAt(i+1);
	      }
	      i = i + 3;
	    }
	    System.out.println("Swapped String: " + output);
	  }


}
