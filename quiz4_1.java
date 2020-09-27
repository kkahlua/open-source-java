package hellojava;

import java.util.Scanner;

public class quiz4_1 {
	public static class Concert{
		String[] concert_seat;
		public Concert()
		{
			concert_seat = new String[10];
			for(int i=0;i<10;i++)
			{
				this.concert_seat[i]="---";
			}
		}
		public int check_seat(String name)
		{
			for(int i=0;i<10;i++)
			{
				if(concert_seat[i]==name)
				{
					System.out.println("이미 자리가 예약되어있습니다.");
					return -1;
				}
			}
			return 1;
		}
		public void print_seat()
		{
			for(int i=0;i<10;i++)
			{
				System.out.print(concert_seat[i]+" ");
			}
		}
		public int concert_reservation(String name, int number) 
		{
			if(check_seat(name)==-1)
				return -1;
			else if(number<0||number>9)
			{
				System.out.println("잘못된 숫자를 입력하셨습니다.");
				return -1;
			}
			if(concert_seat[number]=="---")	
			{
				concert_seat[number]=name;
			}
			return 1;
		}
		public int concert_cancle(String name)
		{
			for (int i=0; i<10; i++)
			{
				if(concert_seat[i].equals(name)) 
				{
					concert_seat[i] = "---";
					System.out.println("예약취소를 성공하였습니다.");
					return 1;	
				}
			}
			System.out.println("예약취소를 실패하였습니다. 실패사유: 해당하는 이름 X");
			return -1;
		}
	}
	public static void main(String[] args) {
		Concert s,a,b;
		int value, sab_value,seat_value,on_off;
		String name;
		s = new Concert();
		a = new Concert(); 
		b = new Concert();
		Scanner scanner= new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		on_off=1;
		while(on_off==1)
		{
			System.out.print("예약 :1, 조회 :2, 취소 :3, 끝내기 :4>>");
			value = scanner.nextInt();
			if(value==1)
			{
				System.out.print("좌석구분 S(1), A(2), B(3) >>");
				sab_value = scanner.nextInt();
				if(sab_value==1)
				{
					System.out.print("S>> ");
					s.print_seat();
					System.out.print("\n이름>>");
					name = scanner.next();
					System.out.print("번호>>");
					seat_value = scanner.nextInt();
					s.concert_reservation(name, seat_value-1);
				}
				else if(sab_value==2)
				{
					System.out.print("A>> ");
					a.print_seat();
					System.out.print("\n이름>>");
					name = scanner.next();
					System.out.print("번호>>");
					seat_value = scanner.nextInt();
					a.concert_reservation(name, seat_value-1);
				}
				else if(sab_value==3)
				{
					System.out.print("B>> ");
					b.print_seat();
					System.out.print("\n이름>>");
					name = scanner.next();
					System.out.print("번호>>");
					seat_value = scanner.nextInt();
					b.concert_reservation(name, seat_value-1);
				}
				else
				{
					System.out.println("잘못된 숫자를 입력하셨습니다.");
					continue;
				}
			}
			else if(value==2)
			{
				System.out.print("S>> ");
				s.print_seat();
				System.out.print("\nA>> ");
				a.print_seat();
				System.out.print("\nB>> ");
				b.print_seat();
				System.out.println("\n<<< 조회를 완료하였습니다. >>>");
			}
			else if(value==3)
			{
				System.out.print("좌석구분 S(1), A(2), B(3) >>");
				sab_value=scanner.nextInt();
				if(sab_value==1)
				{
					System.out.print("S>> ");
					s.print_seat();
					System.out.print("\n이름>>");
					name = scanner.next();
					s.concert_cancle(name);
				}
				else if(sab_value==2)
				{
					System.out.print("A>> ");
					a.print_seat();
					System.out.print("\n이름>>");
					name = scanner.next();
					a.concert_cancle(name);
				}
				else if(sab_value==3)
				{
					System.out.print("B>> ");
					b.print_seat();
					System.out.print("\n이름>>");
					name = scanner.next();
					
					b.concert_cancle(name);
				}
				else
				{
					System.out.println("잘못된 숫자를 입력하셨습니다.");
					continue;
				}
			}
			else if(value==4)
			{
				on_off=0;
				System.out.println("종료");
			}
			else
			{
				System.out.println("잘못된 숫자를 입력하셨습니다.");
				continue;
			}
		}
		
		
	}

}
