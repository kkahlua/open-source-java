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
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��!>>");
			user= scanner.next();
			cpu = rand.nextInt(3);
			if(cpu==1)
				cpu_s = "����";
			else if(cpu==2)
				cpu_s = "����";
			else
				cpu_s="��";
			switch(user)
			{
				case "����" :
					if(cpu_s=="����")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", �����ϴ�.");
					else if(cpu_s=="����")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", ����ڰ� �����ϴ�.");
					else if(cpu_s=="��")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", ����ڰ� �̰���ϴ�.");
					break;
				case "����":
					if(cpu_s=="����")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", ����ڰ� �̰���ϴ�.");
					else if(cpu_s=="����")
					System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", �����ϴ�.");
					else if(cpu_s=="��")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", ����ڰ� �����ϴ�.");
					break;
				case "��":
					if(cpu_s=="����")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", ����ڰ� �����ϴ�.");
					else if(cpu_s=="����")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", ����ڰ� �̰���ϴ�.");
					else if(cpu_s=="��")
						System.out.print("����� = "+user+" , ��ǻ�� = "+cpu_s+", �����ϴ�.");
					break;
				case "�׸�":
					on_off=0;
					System.out.print("������ �����մϴ�........");
					break;
				default:
					System.out.print("�߸��� �Է��� �ϼ̽��ϴ�.");
			}
		}
	}

}
