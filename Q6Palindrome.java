package assignments;
import java.util.Scanner;
public class Q6Palindrome {
public static void main(String args[]) {
	System.out.println("Enter String");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();sc.close();
	StringBuffer sb=new StringBuffer(s);
	String s1=new String(sb.reverse());
	if(s.equals(s1)) System.out.println(" Palindrome");
	else System.out.println("not a palindrome");
}}
