package hellojava;
import java.util.Scanner;
class Person{
	private int a=-1;
	private int b=-1;
	private int c=-1;
	public int on_off=1;
	public String id;
	
	
	public void Set_Random() {
		a=(int)(Math.random()*3+1);
		b=(int)(Math.random()*3+1);
		c=(int)(Math.random()*3+1);
	}
	public void Print_Start() {
		System.out.println("["+this.id+"]:<Enter>");
	}
	public void Print_Result() {
		if(this.a==this.b&&this.a==this.c)
		{
			on_off=0;
		}
		if(on_off==1)
		System.out.println("\t"+a+"\t"+b+"\t"+c+"\t아쉽군요!");
		else
			System.out.println("\t"+a+"\t"+b+"\t"+c+"\t"+id+"님이 이겼습니다!");
	}
}
public class quiz6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int on_off=1;
		String buffer;
		Person user_a = new Person();
		Person user_b= new Person();
		System.out.print("1번쨰 선수 이름>>");
		user_a.id = scanner.next();
		System.out.print("2번쨰 선수 이름>>");
		user_b.id = scanner.next();
		buffer=scanner.nextLine();
		while(on_off==1)
		{
			user_a.Set_Random();
			user_b.Set_Random();
			user_a.Print_Start();
			buffer=scanner.nextLine();
			user_a.Print_Result();
			if(user_a.on_off==0)
			{
				on_off=0;
				continue;
			}
			user_b.Print_Start();
			buffer=scanner.nextLine();
			user_b.Print_Result();
			if(user_b.on_off==0)
			{
				on_off=0;
				continue;
			}
		}
	}

}
