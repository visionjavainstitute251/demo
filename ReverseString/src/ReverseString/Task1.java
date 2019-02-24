package ReverseString;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Your String");
		Scanner read =new Scanner(System.in);
		String str=read.nextLine();
		System.out.println(str);
		String str1=read.nextLine();
		System.out.println(str1);
		StringBuilder sb=new StringBuilder();
		/*for(int i=0;i<=7;i++)
		{
			sb.append(str.charAt(i));
		}*/
		StringBuilder sb1=new StringBuilder();
		for(int j=10;j<=9;j--)
		{
			sb1.append(str1.charAt(j));
		}
		
		System.out.println("Your output");
		//System.out.println(sb.toString());
		System.out.println(sb1.toString());
	}
}
