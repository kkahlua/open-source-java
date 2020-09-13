package hellojava;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번쨰 원의 중심과 반지름 입력 : ");
		double a_x = scanner.nextDouble();
		double a_y = scanner.nextDouble();
		double a_r = scanner.nextDouble();
		System.out.print("두번쨰 원의 중심과 반지름 입력 : ");
		double b_x = scanner.nextDouble();
		double b_y = scanner.nextDouble();
		double b_r = scanner.nextDouble();
		double dif_x,dif_y;
		if((a_x-b_x)>0)
			dif_x=a_x-b_x;
		else
			dif_x=b_x-a_x;
		if((a_y-b_y)>0)
			dif_y=a_y-b_y;
		else
			dif_y=b_y-a_y;
		double l = dif_x*dif_x +dif_y*dif_y;
		l= Math.sqrt(l);
		if(l<=a_r+b_r)
			System.out.print("두 원은 서로 곂친다");
		else
			System.out.print("두 원은 서로 곂치지 않는다");
		
	}
}
