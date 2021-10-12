package assignments;

import java.util.Scanner;

public class Q7SwapEvenOddIndex {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();sc.close();
	    String output = "";
	    for (int i = 0; i < str.length(); i++) {
	      if (i + 1 < str.length()) {
	        output = output + str.charAt(i + 1);
	        output = output + str.charAt(i);
	      }
	      i = i + 1;
	    }
	    System.out.println("Swapped String: " + output);
	  }

}
