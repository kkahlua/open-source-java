package hellojava;
import java.util.Vector;
import java.util.Scanner;

public class quiz7 {

	static public class Nation {
		private String nation,capital;
		public Nation(){
			
		}
		public Nation(String nation, String capital) {
			this.nation = nation;
			this.capital = capital;
		}
		public String GetCountry() {
			return nation;
		}
		public String GetCapital() {
			return capital;
		}
	}
	static private Scanner scanner = new Scanner(System.in);
	static private Vector<Nation> v = new Vector<Nation>();
	
	static public class Game {
		private boolean check_overlap(String word) {
			for(int i=0; i<v.size(); i++) {
				if(v.get(i).GetCountry().equals(word)) {
					return true;
				}
			}
			return false;
		}
		private void Input() {
			int size = v.size();
			System.out.println("���� " + size + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
			size++;
			while(true) {
				System.out.print("����� ���� �Է�" + size + ">> ");
				String word1 = scanner.next(); 
				if(word1.equals("�׸�")) {
					break;
				}
				String word2 = scanner.next();
				if(check_overlap(word1)) { 
					System.out.println(word1 + "�� �̹� �ֽ��ϴ�!");
					continue;
				}
				v.add(new Nation(word1, word2));
				size++;
			}
		}
		private void Quiz() {
			while(true) {
				int index = (int)(Math.random()*v.size()); 
				Nation nation = v.get(index);
				String q = nation.GetCountry();
				String a = nation.GetCapital();
				System.out.print(q + "�� ������? ");
				String user = scanner.next(); 
				if(user.equals("�׸�")) {
					break;
				}
				if(user.equals(a))
					System.out.println("����!");
				else
					System.out.println("�ƴմϴ�!");				
			}	
		}
		public void Start() {
			System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
			while(true) {
				System.out.print("�Է�:1, ����:2, ����:3>> ");
				int menu = scanner.nextInt();
				switch(menu) {
					case 1: Input(); break;
					case 2: Quiz(); break;
					case 3:	System.out.println("������ �����մϴ�."); return;
				}
			}
		}
	}


	public static void main(String[] args) {
		Game game;
		game = new Game();
		game.Start();

	}
}