package com;

public class A {
	  int a=10;
	  int b=20;
	  static int c=30;
	  static int d=40;
	   void m1()
	 {
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(c);
		  System.out.println(d);
	 }
	  static void m2()
	  {
		  A a2=new A();
		  System.out.println(a2.a);
		  System.out.println(a2.b);
		  System.out.println(c);
		  System.out.println(d);
		  
	  }
	  
	  public static void main(String[] args) {
		  A.m2();
		  A a1=new A();
		  a1.m1();
		
	}
	 
	
	
	

}
 