import java.util.Scanner;	// 导入系统包中的类
import sunplusedu.Person;	//导入自定义的包

class PackageDemo 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!");

		Person p = new Person();
		p.talk();		// 默认的权限只能在同一包中访问，及同一个目录下
	}
}
