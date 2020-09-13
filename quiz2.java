package hellojava;
import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산");
		double a = scanner.nextDouble();
		char x = scanner.next().charAt(0);
		double b = scanner.nextDouble();
		if(x=='+')
			System.out.print(a+"+"+b +"의 계산 결과는 "+(a+b));
		else if(x=='-')
			System.out.print(a+"-"+b +"의 계산 결과는 "+(a-b));
		else if(x=='*')
			System.out.print(a+"*"+b +"의 계산 결과는 "+(a*b));
		else if(x=='/')
		{
			if(a==0||b==0)
			{
				System.out.print("0으로 나눌 수 없습니다.");
			}
			else
			{
				System.out.print(a+"/"+b +"의 계산 결과는 "+(a/b));
			}
		}
		else
			System.out.print("잘못된 입력을 하셨습니다.");
	}

}
