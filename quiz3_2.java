package hellojava;
import java.util.Scanner;
import java.util.Random;
public class quiz3_2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int cpu;
		String user;
		String cpu_s;
		int on_off=1;
		while (on_off==1)
		{
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			user= scanner.next();
			cpu = rand.nextInt(3);
			if(cpu==1)
				cpu_s = "가위";
			else if(cpu==2)
				cpu_s = "바위";
			else
				cpu_s="보";
			switch(user)
			{
				case "가위" :
					if(cpu_s=="가위")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 비겼습니다.");
					else if(cpu_s=="바위")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 사용자가 졌습니다.");
					else if(cpu_s=="보")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 사용자가 이겼습니다.");
					break;
				case "바위":
					if(cpu_s=="가위")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 사용자가 이겼습니다.");
					else if(cpu_s=="바위")
					System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 비겼습니다.");
					else if(cpu_s=="보")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 사용자가 졌습니다.");
					break;
				case "보":
					if(cpu_s=="가위")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 사용자가 졌습니다.");
					else if(cpu_s=="바위")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 사용자가 이겼습니다.");
					else if(cpu_s=="보")
						System.out.print("사용자 = "+user+" , 컴퓨터 = "+cpu_s+", 비겼습니다.");
					break;
				case "그만":
					on_off=0;
					System.out.print("게임을 종료합니다........");
					break;
				default:
					System.out.print("잘못된 입력을 하셨습니다.");
			}
		}
		scanner.close();
	}

}
