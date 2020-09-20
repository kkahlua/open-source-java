package hellojava;
import java.util.Scanner;
import java.util.InputMismatchException;

public class quiz3 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=0;
		int m=0;
		while(true)
		{
			System.out.print("곱하고자 하는 두 수 입력>>");
			try 
			{
				n = scanner.nextInt();
				m = scanner.nextInt();
				break;
			}
			catch (InputMismatchException e) 
			{
				System.out.println("실수를 입력하면 안됩니다.");
				scanner.nextLine();
			}
		}
		System.out.print(n+"x"+m+"="+n*m);
		scanner.close();
	}
}
