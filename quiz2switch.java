package hellojava;

import java.util.Scanner;

public class quiz2switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����");
		double a = scanner.nextDouble();
		char x = scanner.next().charAt(0);
		double b = scanner.nextDouble();
		switch(x) {
			case '+':
				System.out.print(a+"+"+b +"�� ��� ����� "+(a+b));
				break;
			case '-':
				System.out.print(a+"-"+b +"�� ��� ����� "+(a-b));
				break;
			case '*':
				System.out.print(a+"*"+b +"�� ��� ����� "+(a*b));
				break;
			case '/':
				if(a==0||b==0)
				{
					System.out.print("0���� ���� �� �����ϴ�.");
				}
				else
				{
					System.out.print(a+"/"+b +"�� ��� ����� "+(a/b));
				}
				break;
			default:
				System.out.print("�߸��� �Է��� �ϼ̽��ϴ�.");
		}
	}
}
