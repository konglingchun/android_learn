

public class Hello
{

	public static void main(String arg[])
	{
		Hello ttb = new Hello();

		ttb.test();
		ttb.test(10);
		ttb.test(100);
	
	}
	void test()
	{
	
		System.out.println("Hello");
	
	}
	void test(int a)
	{
		System.out.println(a);
		if(a == 100)
		{
			System.out.println("good"+a);
		}
	}
}

