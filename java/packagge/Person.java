package sunplusedu;

public class Person	//只有public 类才可以被导入
{
	private String name  = "旺旺";
	private int age = 25;
	
	public void talk(){
		System.out.println("我是："+name+"，今年："+age+"岁");
	}
}
