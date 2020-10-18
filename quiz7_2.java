package hellojava;
import java.util.*;

public class quiz7_2 {

	static public class Map {
		private String nation,capital;
		public Map(){
			
		}
		public Map(String nation, String capital) {
			
		}
		public String GetCountry() {
			return nation;
		}
		public String GetCapital() {
			return capital;
		}
	}
	static private Scanner scanner = new Scanner(System.in);
	static private HashMap<String, String> map = new HashMap<String, String>();
	
	static public class Game {
		private void Input() {
			int size = map.size();
			System.out.println("���� " + size + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
			size++;
			while(true) {
				System.out.print("����� ���� �Է�" + size + ">> ");
				String word1 = scanner.next(); 
				if(word1.equals("�׸�")) {
					break;
				}
				String word2 = scanner.next();
				if(map.containsKey(word1)) { 
					System.out.println(word1 + "�� �̹� �ֽ��ϴ�!");
					continue;
				}
				map.put(word1,word2);
				size++;
			}
		}
		private void Quiz() {
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			while(true) {
				String q = it.next();
				String a = map.get(q);
				System.out.print(q + "�� ������? ");
				String user = scanner.next();
				if(user.equals("�׸�")) {
					break;
				}
				if(user.equals(a))
					System.out.println("����!");
				else
					System.out.println("�ƴմϴ�!");	
				/*
				int index = (int)(Math.random()*map.size());
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
					*/			
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
