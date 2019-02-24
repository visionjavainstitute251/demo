package abc;

interface A {
	
	default void show()
	{
		System.out.println("In A");
	}
	
	static void add()
	{
		System.out.println("add");
	}
	
}

interface J {
	final int a=10;
	default void show()
	{
		System.out.println("In J");
	}
	
	
}
interface f
{
	void add();
}

public class Axn implements A, J
{


	public void show()
	{
		System.out.println("In A");
	}
	public static void main(String[] args) {
		Axn a = new Axn();
		a.show();
		A.add();
	}
	
}

