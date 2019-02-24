package ReverseString;

public class A extends B{
	
	public void add(int i,int j)
	{
		int x=30;
		int y=40;
		System.out.println(i+j);
		System.out.println(a+b);
		System.out.println(x+y);
		
	}
	public static void main(String[] args) {
		/*A a=new A();
		a.add(1000, 2000);*/
		new A().add(2000, 3000);
	}
	
	 

}
class B
{
	int a=10;
	int b=20;
}




